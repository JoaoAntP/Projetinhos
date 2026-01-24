# Estruturas condicionais: Verificar idade

idade = 20

if idade >= 18:
    print('Maior de idade!')
else:
    print('Menor de idade!')


# Exercicio: Aprovado caso a media >= 7, caso contrario Reprovado

nota_p1 = float(input('Informe a nota P1 do aluno: '))
nota_p2 = float(input('Informe a nota P2 do aluno: '))

average = (nota_p1 + nota_p2) / 2

if average >= 7:
    print('Aprovado! :)')
else:
    print('Reprovado! :(')
