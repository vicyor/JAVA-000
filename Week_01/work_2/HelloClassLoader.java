
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.lang.reflect.*;
public class HelloClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class res = null;
        try (FileInputStream fis = new FileInputStream(name);
             ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ) {
            byte[] buf = new byte[1024 * 1024];
            int length = 0;
            while ((length = fis.read(buf, 0, buf.length)) > 0) {
                bos.write(buf,0,length);
            }
            byte[] decode = decode(bos.toByteArray(),bos.size());
            res = defineClass("Hello", decode, 0, decode.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    private byte[] decode(byte[] encode,int length) {
        for (int i = 0; i < length; i++) {
            encode[i] = (byte) (255 - encode[i]);
        }
        return encode;
    }

    public static void main(String[] args) throws Exception{
        HelloClassLoader classLoader=new HelloClassLoader();
        Class<?> clazz = classLoader.findClass("Hello.xlass");
        Object o = clazz.newInstance();
        Method method = clazz.getDeclaredMethod("hello");
        method.invoke(o);
    }
}