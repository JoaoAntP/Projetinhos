# Como criar um dicionário
dictionary = {
    'nome': 'Guilherme',
    'idade': 20,
    'altura': 1.75
}
print(dictionary['nome'])

# Adicionar elementos em um dicionário
dictionary['programador Python'] =  True
print(dictionary)

# Iteando sobre um dicionário
for key in dictionary:
    print(f'{key}: {dictionary[key]}')

# Testar a existência de uma chave
print('nome' in dictionary)    