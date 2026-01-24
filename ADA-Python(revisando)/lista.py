# Lista: Coleção de variáveis

# Criando lista para armazenar 3 variáveis
notas = [10.0, 9.0, 8.5]

# Indexação e slice 
lista = [33, 'Guilherme', 3.14159, True]
print(lista[1])

# Slice (Pegar um pedaço da lista)
print(notas[0:2])

# Percorrendo lista "foreach"
for elemento in lista:
    print(elemento)

# Percorrendo lista com function len
print(len(lista))

for i in range(len(lista)):
    print(f'Indx: {i}; Valor: {lista[i]}')