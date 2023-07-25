public class HotelKeeper
{
    public VegMenu getVegMenu()
    {
        VegRestaurant v = new VegRestaurant();
        VegMenu vegMenu = (VegMenu)v.getMenus();
        return vegMenu;
    }
      
    public NonVegMenu getNonVegMenu()
    {
        NonVegRestaurant v = new NonVegRestaurant();
        NonVegMenu NonvegMenu = (NonVegMenu)v.getMenus();
        return NonvegMenu;
    }
      
    public Both getVegNonMenu()
    {
        VegNonVegRestaurant vnv = new VegNonBothRestaurant();
        Both bothMenu = (Both)vnv.getMenus();
        return bothMenu;
    }    
}