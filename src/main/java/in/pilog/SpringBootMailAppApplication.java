package in.pilog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.pilog.service.IPurchaseOrder;

@SpringBootApplication
public class SpringBootMailAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootMailAppApplication.class, args);

		IPurchaseOrder order = context.getBean(IPurchaseOrder.class);

		try {
			String msg = order.purchase(new String[] { "Fossil-Chronography", "USPOLO-Tshirt", "LouisPhilippe-Shoes" },
					new double[] { 12000.0, 5000.0, 6000.0 }, new String[] { "ajaythomas333@gmail.com",
							"kamblenikita29@gmail.com", "kallepallychandrakiran@gmail.com","javabynitin2023@gmail.com" });
			System.out.println(msg);

		} catch (Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) context).close();
	}
}


