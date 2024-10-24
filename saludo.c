#include <stdio.h>

int main() {
    char nombre[100]; // Array para almacenar el nombre
    printf("¿Cuál es tu nombre? ");
    fgets(nombre, sizeof(nombre), stdin); // Leer el nombre del usuario
    printf("Hola %s. Este programa está hecho en el lenguaje de programación: C.\n", nombre);
    return 0;
}
