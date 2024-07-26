import com.krish.lalwani.hr.dl.exceptions.*;
import com.krish.lalwani.hr.dl.interfaces.dto.*;
import com.krish.lalwani.hr.dl.interfaces.dao.*;
import com.krish.lalwani.hr.dl.dto.*;
import com.krish.lalwani.hr.dl.dao.*;
public class DesignationAddTestCase
{
public static void main(String gg[])
{
String title=gg[0];
try
{
DesignationDTOInterface designationDTO = new DesignationDTO();
designationDTO.setTitle(title);
DesignationDAOInterface designationDAO = new DesignationDAO();
designationDAO.add(designationDTO);
System.out.println("Designation: "+title+" added with code as: "+designationDTO.getCode());
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}