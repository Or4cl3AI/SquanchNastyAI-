```java
package com.squanchNastyAI;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class APKGenerator {

    private Context context;

    public APKGenerator(Context context) {
        this.context = context;
    }

    public void generateAPK() {
        try {
            File srcFile = new File(context.getPackageCodePath());
            File destFile = new File(Environment.getExternalStorageDirectory().toString() + "/Download/SquanchNastyAI.apk");
            if (!destFile.getParentFile().exists()) {
                destFile.getParentFile().mkdirs();
            }
            if (!destFile.exists()) {
                destFile.createNewFile();
            }
            FileChannel source = new FileInputStream(srcFile).getChannel();
            FileChannel destination = new FileOutputStream(destFile).getChannel();
            destination.transferFrom(source, 0, source.size());
            source.close();
            destination.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```