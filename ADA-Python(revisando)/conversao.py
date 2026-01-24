# Converter variavel idade para int
idade_user = '33'
idade_admin = '77'

# Caso tente somar irá concatenar
print(f'{idade_user} + {idade_admin} = {idade_user + idade_admin}')

# Modo correto, note que a funcao int() converte o valor da variavel para int
print(f'{idade_user} + {idade_admin} = {int(idade_user) + int(idade_admin)}')
