package lab6;

import java.io.IOException;

public class ImgFactory {
    public static void createImg(String i) throws IOException {
        if (i.toLowerCase().endsWith("png")) {
            ImgPNG.img(i);
        }
        else {
            if (i.toLowerCase().endsWith("jpg")) {
                ImgJPG.img(i);
            }
            else{
                if(i.toLowerCase().endsWith("bmp")){
                    ImgBMP.img(i);
                }
                else {
                    throw new RuntimeException();
                }
            }
        }

    }
}
