package deepcopy.serialization;

import java.io.*;

/**
 * @author tim
 * @date 2022/10/1 1:11 下午
 */
public class CloneObjUtils {
    public static Object cloneObjBySerialization(Serializable src) {
        Object dest = null;
        try {
            ByteArrayOutputStream bos = null;
            ObjectOutputStream oos = null;
            try {
                bos = new ByteArrayOutputStream();
                oos = new ObjectOutputStream(bos);
                oos.writeObject(src);
                oos.flush();
            } finally {
                oos.close();
            }
            byte[] bytes = bos.toByteArray();
            ObjectInputStream ois = null;
            try {
                ois = new ObjectInputStream(new ByteArrayInputStream(bytes));
                dest = ois.readObject();
            } finally {
                ois.close();
            }
        } catch (Exception e) {
            e.printStackTrace();//克隆失败
        }
        return dest;
    }
}
