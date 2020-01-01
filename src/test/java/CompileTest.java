import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

public class CompileTest {

	public static void main(String[] args) throws Throwable {
		ClassPool cp = ClassPool.getDefault();
		CtClass class1 = cp.makeClass("hello world");
		CtMethod method = CtMethod.make("public static void test(){System.err.println(\"Hello world\");}", class1);
		class1.addMethod(method);
		Class cls = class1.toClass();
		cls.getMethod("test").invoke(null);
	}

}
