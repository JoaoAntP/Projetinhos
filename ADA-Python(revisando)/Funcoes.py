# Criando uma função sem retorno: Function Saudação
def saudacao(nome='Jeová'):
    print(f'Welcome to World App, {nome}!')

# Criando uma função com retorno: Function Calculadora
def calculadora(x, y, operation='+'):
    if operation == '+':
        return x + y
    elif operation == '-':
        return x - y
    elif operation == '*':
        return x * y
    else:
        return x / y


saudacao('Guilherme')
print(calculadora(66, 2, '/'))

