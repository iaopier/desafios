# Desafios IDwall
# Strings

O problema foi resolvido utilizando a linguagem Java com a IDE Netbeans.

O programa recebe como parâmetros um texto, uma quantidade de caracteres por linha, justificar o texto ou não. Esses parâmetros são opcionias. 

A estratégia para resolução do problema foi:

## Separar em linhas por N máximo de caracteres

Percorrer linha por linha da entrada fornecida (texto a ser identado). 
Em cada uma dessas linhas o algoritmo percorre-a e executa uma quebra de linha toda vez que encontrar o máximo de caracteres. 
Caso esse máximo seja uma palavra, ele realiza a quebra antes da palavra, para que não ocorra divisão de palavras.
Caso não seja, ele quebra a linha após a palavra.

## Execução

Em uma IDE, importar o projeto e fornecer os argumentos que forem desejados para realizar a execução.

## Testes

Foram implementados dois testes unitários (JUnit), para verificar o funcionamento dos métodos individuais.

# Crawler

O problema foi resolvido utilizando Python.

## Realizar "Scraping" no Reddit

Recebe via parâmetros os subReddits, separados por ";"
Para cada subReddit 
