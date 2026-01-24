# Adivinha numero sorteado

sortedNumber = 3
chosenNumber = int(input('Informe um número entre (0, 10): '))

while sortedNumber != chosenNumber:
    print('Tente novamente')
    chosenNumber = int(input('Informe um número entre (0, 10): '))

print('Correto! >)')