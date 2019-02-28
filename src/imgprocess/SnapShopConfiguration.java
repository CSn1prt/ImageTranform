package imgprocess;

//Write your short report here (-2 if there is no report)

/**
* A class to configure the SnapShop application
*
* @author (your name)
* @version (a version number or a date)
*/
public class SnapShopConfiguration
{
/**
* Method to configure the SnapShop.  Call methods like addFilter
* and setDefaultFilename here.
* @param theShop A pointer to the application
*/
public static void configure(SnapShop theShop)
{

 theShop.setDefaultFilename("C:\\Users\\csn1ptr\\eclipse-workspace\\ImageTranform\\billg.jpg");
 theShop.addFilter(new FlipHorizontalFilter(), "Flip Horizontal");
 theShop.addFilter(new FlipVerticalFilter(),  "Flip Vertical");
 // add your other filters below
}
}