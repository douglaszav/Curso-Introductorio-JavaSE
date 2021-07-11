public class UpdatingVariables {
   /**Clase sobre Variables*/

    public static void main(String[] args) {
        int salary = 1000;
        salary = salary + 200;
        System.out.println(salary);
        salary -= 50;
        System.out.println(salary);
        salary = salary + 60 - 45;
        System.out.println(salary);
        String employeeName = "Anahí Salgado";
        employeeName = employeeName + " Díaz de la Vega";
        System.out.println(employeeName);
        employeeName = "Irene " + employeeName;
        System.out.println("Tu nombre es: " + employeeName);
    }
}