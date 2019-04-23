import unittest
import re
from scraper import open_html,get_sub_reddits 

class TestScraper(unittest.TestCase):

    def setUp(self):
        pass
    
    def test_open_html(self):
        status = str(open_html("teste").status_code)
        self.assertTrue(re.match("[2,4-5]+..",status))

    def test_get_sub_reddits(self):
        url = get_sub_reddits("soccer;csgo;java")
        self.assertTrue(['soccer','csgo','java'],url)     

if __name__ == '__main__':
    unittest.main()
