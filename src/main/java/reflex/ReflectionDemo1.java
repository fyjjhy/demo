package reflex;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * <Description> Class<br>
 *一个类在JVM中只会有一个CLss实例
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月13日 <br>
 * @see reflex <br>
 * @since V1.0 <br>
 */
public class ReflectionDemo1 {

    public static void main(String[] args) {
        Class clazz = null;
    }

    public final class Class<T> implements Serializable, GenericDeclaration, Type, AnnotatedElement {

        @Override
        public TypeVariable<?>[] getTypeParameters() {
            return new TypeVariable[0];
        }

        @Override
        public <T extends Annotation> T getAnnotation(java.lang.Class<T> annotationClass) {
            return null;
        }

        @Override
        public Annotation[] getAnnotations() {
            return new Annotation[0];
        }

        @Override
        public Annotation[] getDeclaredAnnotations() {
            return new Annotation[0];
        }
    }
}
