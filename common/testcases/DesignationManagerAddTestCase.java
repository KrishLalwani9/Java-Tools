import com.krish.lalwani.hr.bl.managers.*;
import com.krish.lalwani.hr.bl.interfaces.managers.*;
import com.krish.lalwani.hr.bl.interfaces.pojo.*;
import com.krish.lalwani.hr.bl.pojo.*;
import com.krish.lalwani.hr.bl.exceptions.*;
import java.util.*;
class DesignationManagerAddTestCase
{
public static void main(String gg[])
{
String title=gg[0];
DesignationInterface designation = new Designation();
designation.setTitle(title);
try
{
DesignationManagerInterface designationManager;
System.out.println("Designation added with code as: "+designation.getCode());
designationManager=DesignationManager.getDesignationManager();
System.out.println("Designation added with code as: "+designation.getCode());

designationManager.addDesignation(designation);
System.out.println("Designation added with code as: "+designation.getCode());
}catch(BLException ble)
{
if(ble.hasGenericException()) System.out.println("this is it "+ble.getGenericException());
List<String> properties=ble.getProperties();
for(String property:properties) System.out.println(ble.getException(property));
}
}
}