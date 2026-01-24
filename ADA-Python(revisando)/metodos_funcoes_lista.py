# Lista exemplo
lista = [1, 3, 12, 8, 2]
print(f'Lista padrão: {lista}')

# Append (Adicionar elemento ao final de uma lista)
lista.append(3)
print(f'Lista após Append: {lista}')

# Insert (Escolher posição e adicionar elemento em uma lista)
lista.insert(2, 10)
print(f'Lista após Insert: {lista}')

# Extend (Juntar duas listas)
lista_extend = [3, 3, 3]
lista.extend(lista_extend)
print(f'Lista após Extend: {lista}')

# Pop (Remover elemento especificado, caso contrario remove o ultimo elemento)
lista.pop()
print(f'Lista após Pop (Sem especificar o elemento): {lista}')

lista.pop(0)
print(f'Lista após Pop (especificando o elemento): {lista}')

# Remove (Procura o valor e remove, sempre remove o primeiro que ele encontra)
lista.remove(8)
print(f'Lista após Remove: {lista}')

# Count (Contar quantas vezes um elemento aparece na lista)
print(f'Usando Count; Quantidade de "3" na lista: {lista.count(3)}')

# Index (Mostra o índice de determinado valor)
print(f'Usando Index; Índice do elemento "12": {lista.index(12)}')

# Sort (Ordenar a lista)
lista.sort(reverse=True)
print(f'Lista após Sort: {lista}')

# Len (Quantidade de elementos da lista)
print(f'Usando Len; Quantidade de elementos na lista: {len(lista)}')

# Sum (Somar todos os elementos de uma lista)
print(f'Usando Sum; Soma de todos os elementos da lista: {sum(lista)}')

# Min (Retorna o menor valor da lista)
print(f'Usando Min; Menor valor da lista: {min(lista)}')

# Max (Retorna o maior valor da lista)
print(f'Usando Max; Maior valor da lista: {max(lista)}')
