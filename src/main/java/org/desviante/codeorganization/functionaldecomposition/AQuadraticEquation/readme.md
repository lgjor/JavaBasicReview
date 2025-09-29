# A quadratic equation

A quadratic equation is an algebraic equation of degree two. It's easy to solve this equation when you know the quadratic formula.

Here is a simple program for calculating the real roots of a quadratic equation:

```java
public static void findRoots(double a, double b, double c) {
// the equation is ax^2 + bx + c = 0
double discriminant = b * b - 4 * a * c;
if (discriminant < 0) {
System.out.println("No real roots!");
} else if (discriminant == 0) {
double x = -b / (2 * a);
System.out.println("x = " + x);
} else {
double x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
double x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
System.out.println("x1 = " + x1);
System.out.println("x2 = " + x2);
}
}
```

What if we change it a bit by decomposing this code and creating additional methods? That's what we get then:

```Java
public static double calculateDiscriminant(double a, double b, double c) {
return b * b - 4 * a * c;
}

public static void calculateRoots(double a, double b, double c, double discriminant) {
double x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
double x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
if (x1 == x2) {
System.out.println("x = " + x1);
} else {
System.out.println("x1 = " + x1);
System.out.println("x2 = " + x2);
}
}
```

What should the main method look like after decomposition?


## Contexto

### calculateDiscriminant
O método calculateDiscriminant em Java é projetado para calcular o discriminante de uma equação quadrática.  O discriminante é a parte de uma equação quadrática (ax
2
+bx+c=0) que está dentro da raiz quadrada na fórmula quadrática, ou seja, a expressão b
2
−4ac.

O valor do discriminante (Δ) é crucial para determinar a natureza e o número de raízes (soluções) da equação:

Se Δ>0, a equação tem duas raízes reais distintas.

Se Δ=0, a equação tem uma única raiz real (também chamada de duas raízes reais iguais).

Se Δ<0, a equação tem duas raízes complexas conjugadas e nenhuma raiz real.

O método public static double calculateDiscriminant(double a, double b, double c) recebe três coeficientes (a, b, e c) de uma equação quadrática como entrada e retorna o valor do discriminante. Ele utiliza o tipo double para permitir que os coeficientes e o resultado sejam números de ponto flutuante (não inteiros), garantindo maior precisão.

### calculateRoots

O método calculateRoots em Java tem a finalidade de calcular e exibir as raízes (soluções) de uma equação quadrática. Ele recebe como entrada os coeficientes da equação (a, b, e c) e o valor do discriminante (Δ), que é o valor calculado por um método anterior (b
2
−4ac).


O método utiliza a fórmula de Bhaskara para encontrar as raízes da equação. As linhas de código que fazem isso são:

double x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);

double x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);

Aqui, Math.pow(discriminant, 0.5) é usado para calcular a raiz quadrada do discriminante. Em seguida, o método verifica se as duas raízes (x1 e x2) são iguais. Se forem, isso significa que a equação tem apenas uma solução real, e o programa imprime essa única raiz. Caso contrário, a equação tem duas raízes distintas, e o programa imprime ambas.