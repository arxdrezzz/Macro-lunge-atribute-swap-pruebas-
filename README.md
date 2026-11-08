# Hotbar Slots — Fabric 1.21.11

Mod **solo de cliente** con dos teclas configurables para seleccionar directamente:
- Ranura 9 de la barra rápida (tecla predeterminada: `N`).
- Ranura 6 de la barra rápida (tecla predeterminada: `M`).

No automatiza clics, ataques ni combinaciones de combate; únicamente cambia la ranura seleccionada.

## Requisitos
- Minecraft Java 1.21.11
- Fabric Loader 0.18.6 o superior
- Fabric API 0.141.4+1.21.11
- Java 21 para compilar

## Compilar
1. Abre una terminal en la carpeta del proyecto.
2. Ejecuta `gradle build` (necesitas Gradle instalado).
3. El mod compilado estará en `build/libs/hotbar-slots-1.0.0.jar`.

## Instalar
Copia el JAR compilado a `.minecraft/mods`. Asegúrate de tener Fabric API instalado.

## Cambiar las teclas
En Minecraft: Opciones → Controles → Asignación de teclas → categoría **Hotbar Slots**.
Puedes cambiar `Seleccionar ranura 9` y `Seleccionar ranura 6`.

Las teclas iniciales son N y M. Si aparece un conflicto, elige otras desde el menú.


## Compilación automática en GitHub (sin instalar Gradle)

1. Crea un repositorio nuevo en GitHub.
2. Sube **todo el contenido de esta carpeta**, incluida la carpeta oculta `.github`.
3. Abre la pestaña **Actions** del repositorio.
4. Selecciona **Build Fabric mod** y pulsa **Run workflow** (o espera a que termine el flujo automático tras subir el código).
5. Cuando el trabajo termine en verde, abre la ejecución y baja a **Artifacts**.
6. Descarga `hotbar-slots-fabric-1.21.11` y extrae el ZIP. Dentro estará el `.jar` compilado.

El archivo se compila en los servidores de GitHub Actions usando Java 21 y Gradle.
