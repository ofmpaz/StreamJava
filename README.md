# Exemplo de Generics em Java

Este projeto contém um exemplo simples de como usar Generics em Java para garantir a segurança de tipos em coleções. 

## Descrição

O exemplo demonstra a diferença entre o uso de coleções com e sem Generics, e como isso afeta a segurança e a necessidade de fazer casting ao iterar sobre os elementos da lista.

## Estrutura do Código

- **Pacote:** `collections`
- **Classe:** `GenerucsExempleList`

### Funcionalidades

1. **Exemplo sem Generics:**
   - Criação de uma lista (`ArrayList`) sem especificar o tipo de elementos.
   - Adição de elementos de tipos diferentes (String e Integer).
   - Necessidade de casting ao iterar sobre a lista.

2. **Exemplo com Generics:**
   - Criação de uma lista (`ArrayList<String>`) especificando que apenas Strings podem ser adicionadas.
   - Adição de elementos do tipo String.
   - Iteração segura sobre a lista sem necessidade de casting.

