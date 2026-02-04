
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class descargar {

    public static void main(String[] args) {
        // Reemplaza con tu link de playlist de YouTube Music o YouTube
        String playlistUrl = "https://music.youtube.com/playlist?list=PLXQ1uuQUYh_2dM-GDus7zAG8Lgcuyr4PS&si=be_4fVj1ngAvhIZZ";
        // Carpeta donde se guardarán (asegúrate que exista)
        String outputFolder = "C:/Musica/%(title)s.%(ext)s";

        downloadPlaylist(playlistUrl, outputFolder);
    }

    public static void downloadPlaylist(String url, String output) {
        try {
            // Comando para descargar solo audio en MP3 usando yt-dlp
            // Cambia esto en tu archivo descargar.java
            ProcessBuilder builder = new ProcessBuilder(
                    "C:/Herramientas/yt-dlp.exe",
                    "--verbose", // Esto nos dirá qué falla exactamente
                    "-x", // Extraer audio
                    "--audio-format", "mp3",
                    "--audio-quality", "0",
                    "--ffmpeg-location", "C:/Herramientas/ffmpeg.exe", // Ruta directa al ejecutable
                    "--prefer-ffmpeg", // Forzar el uso de FFmpeg
                    "-o", output,
                    url
            );

            builder.redirectErrorStream(true);
            Process process = builder.start();

            // Mostrar el progreso en la consola de Java
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("\n✅ ¡Descarga completada con éxito!");
            } else {
                System.out.println("\n❌ Ocurrió un error en la descarga.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
