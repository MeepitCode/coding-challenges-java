# Coding Challenges & Interview Prep 🚀

Olaaa, en este repositorio estoy recopilando  desafíos técnicos reales de distintas empresas del sector tecnológico. El objetivo es practicar y poder centralizar los ejercicios que ponen en las entrevistas en lenguaje **Java**.

Si tienes alguin ejercicio que te guste compartir, eres bienvenid@ ! n.n ✨

---

## 📊 Índice de Desafíos

Aquí puedes ver la bitácora de vuelo con los ejercicios disponibles:

| # | Ejercicio | Empresa | Enfoque Principal | Solución |
|---|---|---|---|---|
| 1 | [Diferencia de Diagonales](#-1-diferencia-de-diagonales--latam-airlines) | LATAM Airlines ✈️ | Matrices / Complejidad $\mathcal{O}(n)$ | [Ver código](./Solution-LATAM-Airlines.java) |

---

## 🚀 Desafíos y Enunciados

### 🧭 1. Diferencia de Diagonales — LATAM Airlines

*   **Empresa:** LATAM Airlines ✈️
*   **Puesto Objetivo:** Java Developer (Prueba Técnica)
*   **Categoría:** Algoritmos / Estructuras de Datos Básicas

#### 📝 Enunciado del Problema
Dada una matriz cuadrada de tamaño $n \times n$ (donde $n$ es un número entero), calcula la **diferencia absoluta** entre las sumas de sus dos diagonales: la diagonal principal y la diagonal secundaria.

*   **Input:** La entrada es una matriz representada como una lista de listas (`List<List<Integer>>`), donde cada lista interna representa una fila de la matriz.
*   **Output:** Imprime un número entero con la diferencia absoluta entre las sumas de las diagonales.

#### 📥 Ejemplo de Entrada
```json
[
  [11, 2, 4],
  [4, 5, 6],
  [10, 8, -12]
]
```

#### Explicación de los Datos
*   La diagonal principal se mueve de arriba-izquierda a abajo-derecha: $11 + 5 + (-12) = 4$.
*   La diagonal secundaria se mueve de arriba-derecha a abajo-izquierda: $4 + 5 + 10 = 19$.
*   La diferencia absoluta final se calcula ignorando los signos negativos intermediarios: $|4 - 19| = 15$.
