import API.Thermostat;
import DATA.UniteTemperature;

/*****************************
 | Created by IntelliJ IDEA. |
 | User: HUBERT Samuel       |
 *****************************/

public class TestThermostat
{
	public static void main(String[] args)
	{
		System.out.println("\nT1\n");
		Thermostat t1 = new Thermostat();
		System.out.println(t1.readTemperature());
		System.out.println(t1.readTemperature(UniteTemperature.K));
		t1.changeUnit(UniteTemperature.F);
		System.out.println(t1.readTemperature());

		System.out.println("\nT2\n");
		Thermostat t2 = new Thermostat();
		System.out.println(t2.readTemperature());
		System.out.println(t2.getUnite());
		t2.increaseTemperature();
		System.out.println(t2.readTemperature());
		t2.decreaseTemperature();
		System.out.println(t2.readTemperature());
		System.out.println("\nT3\n");
		Thermostat t3 = new Thermostat();
		System.out.println(t3.readTemperature());
	}
	//---------------------//
	//      attributes     //
	//---------------------//

	//---------------------//
	//     constructors    //
	//---------------------//

	//---------------------//
	//      accessors      //
	//---------------------//

	//---------------------//
	//       methods       //
	//---------------------//

	//---------------------//
	//    redefinitions    //
	//---------------------//

	//---------------------//
	//        others       //
	//---------------------//
}
