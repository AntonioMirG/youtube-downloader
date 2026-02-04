# Music Downloader (yt-dlp Wrapper)

Un descargador de música automatizado desarrollado en **Java** que utiliza el motor de **yt-dlp** para extraer audio de alta calidad directamente desde YouTube Music o YouTube.

## Características
* **Descarga de Playlists:** Pasa un link y el programa bajará todas las canciones una por una.
* **Conversión a MP3:** Extrae el audio y lo convierte automáticamente a formato MP3 de 320kbps.
* **Smart Sync:** Si vuelves a ejecutarlo en la misma carpeta, solo descargará las canciones nuevas.
* **Logging en tiempo real:** Visualiza el progreso de la descarga directamente en la consola de Java.

## Requisitos Previos

Para que este programa funcione, necesitas tener instaladas las siguientes herramientas en tu sistema:

1.  **Java JDK 17+**
2.  **yt-dlp:** El motor de descarga ([Descargar aquí](https://github.com/yt-dlp/yt-dlp)).
3.  **FFmpeg:** Necesario para la conversión a MP3 ([Descargar aquí](https://www.gyan.dev/ffmpeg/builds/)).

### Configuración de Carpetas
El código está configurado por defecto para buscar las herramientas en:
`C:/Herramientas/`

Asegúrate de tener estos archivos allí:
* `yt-dlp.exe`
* `ffmpeg.exe`
* `ffprobe.exe`

## Instalación y Uso

1.  **Clona el repositorio:**
    ```bash
    git clone [https://github.com/tu-usuario/nombre-del-repo.git](https://github.com/tu-usuario/nombre-del-repo.git)
    ```

2.  **Configura tu ruta de descarga:**
    Abre el archivo `descargar.java` y modifica la variable `carpetaDestino`:
    ```java
    String carpetaDestino = "C:/Tu/Ruta/De/Musica/";
    ```

3.  **Compila y Ejecuta:**
    Si usas VS Code, simplemente presiona `F5` o ejecuta en la terminal:
    ```bash
    javac descargar.java
    java descargar
    ```

## Tecnologías utilizadas
* **Java:** Lenguaje principal y gestión de procesos.
* **yt-dlp:** CLI para la extracción de contenido multimedia.
* **FFmpeg:** Procesamiento y codificación de audio.

## Notas Legales
Este proyecto ha sido creado con fines educativos y de uso personal. Recuerda respetar los términos de servicio de las plataformas y los derechos de autor de los artistas.

