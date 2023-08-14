public class Principal {

    public static void main(String[] args) {
        nombre_usu = nombre();
        email_usu = email();
        boletos_usu = cant_b();
        presupuesto_usu = presupuesto();
        costo_usu = Gasto();

        rand1 = A();
        rand2 = b();
        rand3 = c();



        if (rand1 < rand2 && rand1 > rand3){
            if (boletos_usu < Dispo){
                Dispo = cant_b - Dispo
                if (Local == 1){
                    costo_usu = boletos_usu * 100

                }
                elif (Local == 2){
                    costo_usu = boletos_usu * 500

                }
                elif(Local == 3){
                    costo_usu = boletos_usu * 1000

                }

                if (costo_usu > presupuesto_usu){
                    System.out.println("El costo de los boletos ha sobrepasado su presupuesto :c")
                }
                else{
                    System.out.println("Su compra se ha real")
                }
            }
        }
        
        if (rand1 > rand2 && rand1 < rand3){
            if (boletos_usu < Dispo){
                Dispo = cant_b - Dispo
                if (Local == 1){
                    costo_usu = boletos_usu * 100

                }
                elif (Local == 2){
                    costo_usu = boletos_usu * 500

                }
                elif(Local == 3){
                    costo_usu = boletos_usu * 1000

                }

                if (costo_usu > presupuesto_usu){
                    System.out.println("El costo de los boletos ha sobrepasado su presupuesto :c")
                }
                else{
                    System.out.println("Su compra se ha real")
                }
            }

        }
    }

}