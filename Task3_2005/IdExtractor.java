package Task3_2005;

public class IdExtractor {

    @SuppressWarnings("unchecked")
    public static <E extends Identifiable<R>, R> R[] extractIds(E[] array, Class<R> idComponentType) {
        if (array == null) {
            return null;
        }

        R[] idArray = (R[]) java.lang.reflect.Array.newInstance(idComponentType, array.length);

        for (int i = 0; i < array.length; i++) {
            idArray[i] = array[i].getId();
        }

        return idArray;
    }
}