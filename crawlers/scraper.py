import requests
import re
import sys
from bs4 import BeautifulSoup


def BMP(s):
    return "".join((i if ord(i) < 10000 else '\ufffd' for i in s))

def open_html(path):
    page = requests.get("https://old.reddit.com/r/"+path, headers = {'User-agent': 'Super Bot 9000'})
    print("Requested URL "+path)
    print(page.status_code)
    return page
    
def get_sub_reddits(url):
    url = url.split(";")
    return url

def get_content(page):
    soup = BeautifulSoup(page.content, 'html.parser')
    attrs = {'class': 'thing'}
    message = ""
    messageToSend = ""
    for thread in soup.find_all('div', attrs=attrs):
        try:
            trending = BMP(thread.find("div", attrs={"class": "score likes"}).text)
            trending = re.sub("\.","",trending)
            trending = re.sub("k","000",trending)
            if trending == "•":
                trending = 0
            if(int(trending) > 5000):
                message = "Upvote number -> "+trending+"\n Title -> "+BMP(thread.find('p', class_="title").text)+"\nThread link -> "+BMP(thread.find("a").attrs['href'])+"\nThread comments link -> "+BMP(thread.find('a', class_='comments').attrs['href'])+"\n"
                message = re.sub("\_","",message)
                print(telegram_bot_sendtext(message))
        except AttributeError:
            print("Failed!")
    
def telegram_bot_sendtext(bot_message):
    bot_token = '854673095:AAEqhIFMuql215inNB2ATVjRD9O2h8-fQIY'
    bot_chatID = '@testepiercarlo'
    send_text = 'https://api.telegram.org/bot' + bot_token + '/sendMessage?chat_id=' + bot_chatID + '&parse_mode=Markdown&text=' + bot_message
    response = requests.get(send_text)
    return response.json()
            
if __name__ == "__main__":
    if len(sys.argv) <= 1:
        url = "popular"        
    else:
        url = sys.argv[1] 
    for url in get_sub_reddits(url):
        get_content(open_html(url))




