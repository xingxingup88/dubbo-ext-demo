import java.util.HashMap;
import java.util.List;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.common.extension.ExtensionFactory;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.remoting.Transporter;

import com.service.ITestInterface;

public class Test {

	public static void main(String[] args) {
		//test getExtension
		String[] extNames = new String[]{"imp1", "imp2", "imp3"};
		for (String name : extNames)
		{
			ITestInterface test = ExtensionLoader.getExtensionLoader(ITestInterface.class).getExtension(name);
			test.dosth1(null);
			test.dosth2(null);
		}
		
		//test getDefaultExtension
		ITestInterface defaultExt = ExtensionLoader.getExtensionLoader(ITestInterface.class).getDefaultExtension();
		defaultExt.dosth1(null);
		defaultExt.dosth2(null);
		defaultExt.doDefault(null);
		
		//test getAdaptiveExtension
		ITestInterface adaptExt = ExtensionLoader.getExtensionLoader(ITestInterface.class).getAdaptiveExtension();
		URL url1 = new URL("test", null, 0, new HashMap<String, String>() {{
			put("key1", "imp1");
			put("key2", "imp2");
		}});
		adaptExt.dosth1(url1);
		adaptExt.dosth2(url1);
		adaptExt.doDefault(url1);
		
		//test getActivateExtension
		List<ITestInterface> actExt = ExtensionLoader.getExtensionLoader(ITestInterface.class).getActivateExtension(url1, "key1", "g1");
		for (final ITestInterface test : actExt)
		{
			test.dosth1(url1);
		}
 	}
}
