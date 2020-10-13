
package SamplePrograms.ArrayMethods;


public class IceCreamSurvey {

    public static void main(String[] args) {
      String survey[][] = {
          {"Parth","Chocolate"},
          {"Sebastian", "Strawberry"},
          {"Justin","Strawberry"},
          {"Ethan","Vanilla"},
          {"Xavier","Chocolate"},
          {"Thomas","Vanilla"},
          {"John","Strawberry"},
          {"Spencer","Chocolate"}  
      };
      //print suvery results
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print(j==0? "Name: " : "Flavour: ");
                System.out.println("\t" + survey[i][j]);
            }
            System.out.println("-------------------");
        }
        String vnames[] = getList(survey, "Vanilla");
        String cnames[]= getList(survey, "Chocolate");;
        String snames[]= getList(survey, "Strawberry");
        
        System.out.println("Here are the people who like Vanilla:");
        for (int i = 0; i < vnames.length; i++) 
               System.out.print(vnames[i] + ", ");
        System.out.println("\n------------------------");
        
        System.out.println("Here are the people who like Chocolate:");
        for (int i = 0; i < cnames.length; i++) 
               System.out.print(cnames[i] + ", ");
        System.out.println("\n------------------------");
        
        System.out.println("Here are the people who like Strawberry");
        for (int i = 0; i < snames.length; i++) 
               System.out.print(snames[i] + ", ");
        System.out.println("\n------------------------");
        
    }  //ends main method
    
    //send in data - return array of names that match the flavour
    
    public static String[] getList (String data[][], String flav){
        String names=""; //split into an array
        for (int i = 0; i < data.length; i++) {
            if(flav.equals(data[i][1]))
                names += data[i][0] + ",";
        }
        return names.split(",");
    }
    
    
}
