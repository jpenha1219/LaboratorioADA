def palabraMatching(words, lettersform):
    for index in words:
        if index not in lettersform:
            return False

    return True


lettersform = input()
firstLetter= lettersform[0]

numeroPalabrasDiccionario = int(input())
for _ in range(numeroPalabrasDiccionario):
    aux = input()
    if len(aux) < 4:
        continue

    if firstLetter not in aux:
        continue

    if palabraMatching(aux, lettersform):
        print(aux)