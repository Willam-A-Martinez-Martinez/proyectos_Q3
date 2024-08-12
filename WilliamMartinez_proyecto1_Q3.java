package tienda;

import java.util.Scanner;

public class WilliamMartinez_proyecto1_Q3 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");

        boolean bucle = true, cajaOpen= true;
        int caja = 0, codigoProducto=0, eleccionComp = 0, contadorCaja=0, contadorVenta=0, contadorCompra=0;
        String tipoCliente="", tipoProducto="", listProducts="", descuentoStr="", productoEstrella="";
        double kiloOpcion=0, contadorAzucar = 0, contadorAvena = 0, contadorTrigo = 0, contadorMaiz = 0, mayorVenta=0, mayorCompra=0;
        double contadorAzucarV = 0, contadorAvenaV = 0, contadorTrigoV = 0, contadorMaizV = 0, totalComp=0, costoComp=0;
        double totalV=0, totalPreV=0, subtotal=0, descuentoV=0, costoV=0, impuestos=0, volumenVenta=0, volumenCompra=0, margenGanancia=0;
        double kgVendidoAzucar=0, kgVendidoAvena=0, kgVendidoTrigo=0, kgVendidoMaiz=0;
        String ingresoAzucar = "",  ingresoAvena = "", ingresoTrigo = "", ingresoMaiz ="", firstPlace="", secondPlace="", thirdPlace="", fourthPlace="" ;

        while (bucle) {
            if(cajaOpen==false){
                System.out.println("Estado de la caja:  cerrada.");
            }
            System.out.println("----------MENU----------"
                    + "\n1- Abrir caja"
                    + "\n2- Ventas"
                    + "\n3- Compras"
                    + "\n4- reportes"
                    + "\n5- cierre de caja"
                    + "\n6- salir sistema");
            System.out.println("Ingrese donde quiere acceder:");
            int eleccion = lea.nextInt();
            
            if (eleccion == 6) {
                System.out.println("-------PROGRAMA FINALIZADO-------");
                break;
            } else if (eleccion < 1 || eleccion > 6) {
                System.out.println("-------INGRESE VALORES UNICAMENTE ENTRE 1 A 6-------");
            } else if (eleccion == 1) {
                System.out.println("Caja: LPS." + caja);
                System.out.println("ingrese la cantidad de dinero que quiere agregar a la caja: ");
                int agregarDinero = lea.nextInt();
                
                
                while(agregarDinero<=0){
                   System.out.println("Error numeros menores a 0 o iguales. Ingrese la cantidad de dinero que quiere agregar a la caja: ");
                   agregarDinero = lea.nextInt();
                }
                caja += agregarDinero;
                cajaOpen=true;
                
                
            } 
            
            else if (eleccion == 2 && cajaOpen) {
                if(contadorAzucar == 0 && contadorAvena == 0 && contadorTrigo == 0 && contadorMaiz == 0){
                    System.out.println("No hay producto para vender, reabastecer producto");
                }
                if(contadorAzucar != 0 || contadorAvena != 0 || contadorTrigo != 0 || contadorMaiz != 0){
                        
                    System.out.println("******************************VENTAS******************************");
                    System.out.println("------------------------Tipo de cliente------------------------"
                            + "\n|A: Tiene acceso a la compra de todos los productos.          |"
                            + "\n|B: Tiene acceso a la compra de productos con codigo 1,2 y 3. |"
                            + "\n|C: Tiene acceso a la compra de productos de codigo 4.        |"
                            + "\n---------------------------------------------------------------");
                    System.out.println("Ingrese el tipo de cliente: ");
                    tipoCliente = lea.next();
                    
                    while(tipoCliente.equalsIgnoreCase("a") || tipoCliente.equalsIgnoreCase("b") || tipoCliente.equalsIgnoreCase("c")){
                        System.out.println("Error. solo se seleccionan opciones de A, B, C\nIngrese el tipo de cliente: ");
                        tipoCliente = lea.next();
                    }
                    /*
                    ___________________________________________________________________
                   |____CODIGO____|__________PRODUCTO__________|________PRECIO________|
                   |       1      |           AZUCAR           |       LPS. 30        |
                   |       2      |           AVENA            |       LPS. 25        |
                   |       3      |           TRIGO            |       LPS. 32        |
                   |_______4______|___________MAIZ_____________|_______LPS. 20________|

                     */
                    while(true){
                            if(tipoCliente.equalsIgnoreCase("a")){
                                System.out.println("______________________________________________________________________________________________\n" +
                                                   "|____CODIGO____|__________PRODUCTO__________|________PRECIO________|__Kilogramos_disponibles__|\n" +
                                    "|       1      |           AZUCAR           |       LPS. 30        |__________"+contadorAzucar+"_____________|\n" +
                                    "|       2      |           AVENA            |       LPS. 25        |__________"+contadorAvena+"_____________|\n" +
                                    "|       3      |           TRIGO            |       LPS. 32        |__________"+contadorTrigo+"_____________|\n" +
                                    "|_______4______|___________MAIZ_____________|_______LPS. 20________|__________"+contadorMaiz+"_____________|");

                                System.out.println("Ingrese el codigo de producto:");
                                codigoProducto=lea.nextInt();

                                while(codigoProducto<1 || codigoProducto>4){
                                    System.out.println("Error. Ingrese uno de los codigos que aparecen en la tabla.");
                                    codigoProducto=lea.nextInt();
                                }
                            }
                            else if(tipoCliente.equalsIgnoreCase("b")){
                                System.out.println("______________________________________________________________________________________________\n" +
                                                   "|____CODIGO____|__________PRODUCTO__________|________PRECIO________|__Kilogramos_disponibles__|\n" +
                                                   "|       1      |           AZUCAR           |       LPS. 30        |__________"+contadorAzucar+"____________|\n" +
                                                   "|       2      |           AVENA            |       LPS. 25        |__________"+contadorAvena+"____________|\n" +
                                                   "|_______3______|___________TRIGO____________|_______LPS. 32________|__________"+contadorTrigo+"____________|\n");
                                System.out.println("Ingrese el codigo de producto:");
                                codigoProducto=lea.nextInt();

                                while(codigoProducto<1 || codigoProducto>3){
                                    System.out.println("Error. Ingrese uno de los codigos que aparecen en la tabla.");
                                    codigoProducto=lea.nextInt();
                                }
                            }
                            else if(tipoCliente.equalsIgnoreCase("c")){
                                System.out.println("___________________________________________________________________\n" +
                                "|____CODIGO____|__________PRODUCTO__________|________PRECIO________|__Kilogramos_disponibles__|\n" +
                                "|_______4______|___________MAIZ_____________|_______LPS. 20________|__________"+contadorMaiz+"____________|");
                                System.out.println("Ingrese el codigo de producto:");
                                codigoProducto=lea.nextInt();

                                while(codigoProducto!=4){
                                    System.out.println("Error. Ingrese uno de los codigos que aparecen en la tabla.");
                                    codigoProducto=lea.nextInt();
                                }
                            }
                        if(codigoProducto==1){
                            System.out.println("____________________________________________________________________________________\n" +
                                "|____CODIGO____|__________PRODUCTO__________|________PRECIO________|___KILOGRAMOS___|\n" +
                                "|_______1______|___________Azcuar____________|_______LPS. 30_______|_____"+contadorAzucar+"________|");
                        }
                        
                        else if(codigoProducto==2){
                            System.out.println("____________________________________________________________________________________\n" +
                                "|____CODIGO____|__________PRODUCTO__________|________PRECIO________|___KILOGRAMOS___|\n" +
                                "|_______2______|___________Avena____________|_______LPS. 25_______|_____"+contadorAvena+"________|");
                        }
                        
                        else if(codigoProducto==3){
                            System.out.println("____________________________________________________________________________________\n" +
                                "|____CODIGO____|__________PRODUCTO__________|________PRECIO________|___KILOGRAMOS___|\n" +
                                "|_______3______|___________Trigo____________|_______LPS. 32_______|_____"+contadorTrigo+"________|");
                        }
                        
                        else if(codigoProducto==4){
                            System.out.println("____________________________________________________________________________________\n" +
                                "|____CODIGO____|__________PRODUCTO__________|________PRECIO________|___KILOGRAMOS___|\n" +
                                "|_______4______|___________Maiz___________|_______LPS. 20_______|_____"+contadorMaiz+"_________|");
                        }
                        
                            System.out.println("--------------------------------------"+
                            "\nIngrese la cantidad de kilogramos que desea comprar del producto:");
                            kiloOpcion=lea.nextDouble();

                            while(kiloOpcion<=0){
                                System.out.println("--------------------------------------"+
                                "\nIngrese la cantidad de kilogramos que desea comprar del producto:");
                                kiloOpcion=lea.nextDouble();
                            }
                            
                            
                            
                            
//Necesitamos producto/s comprado/s, precio por kilogramo, descuento, ISV, subtotal, total pero para mostrar productos comprados necesitamos concatenar Strings
//tambien especificar la cantidad de kilos y precio unitario que hay, luego de eso el descuento, ISV, subtotal, y por ultimo el total
                            if((codigoProducto==1 && contadorAzucar<kiloOpcion) || (codigoProducto==2 && contadorAvena<kiloOpcion) || (codigoProducto==3 && contadorTrigo<kiloOpcion) || (codigoProducto==4 && contadorMaiz<kiloOpcion) ){
                                System.out.println("No tenemos producto suficiente para realizar la compra");
                                totalPreV=0;
                            }

                            else if(codigoProducto==1 && (tipoCliente.equalsIgnoreCase("a") || tipoCliente.equalsIgnoreCase("b")) && contadorAzucar>=kiloOpcion ){
                                contadorAzucarV+=kiloOpcion;
                                kgVendidoAzucar+=kiloOpcion;
                                ingresoAzucar="|________Azcuar______|____________LPS. 30___________|___________"+contadorAzucarV+"_____________|\n";
                                
                                contadorAzucar-=kiloOpcion;
                                totalPreV=30*kiloOpcion;
                                costoV=30;
                                System.out.println("Siempre entra?");
                                
                            }
                            else if(codigoProducto==2 && (tipoCliente.equalsIgnoreCase("a") || tipoCliente.equalsIgnoreCase("b")) && contadorAvena>=kiloOpcion){
                                contadorAvenaV+=kiloOpcion;
                                kgVendidoAvena+=kiloOpcion;
                                ingresoAvena="|________Avena________|____________LPS. 25____________|____________"+contadorAvenaV+"_____________|\n";
                                
                                contadorAvena-=kiloOpcion;
                                totalPreV=25*kiloOpcion;
                                costoV=25;
                                
                            }
                            else if(codigoProducto==3 && (tipoCliente.equalsIgnoreCase("a") || tipoCliente.equalsIgnoreCase("b")) && contadorTrigo>=kiloOpcion){
                                contadorTrigoV+=kiloOpcion;
                                kgVendidoTrigo+=kiloOpcion;
                                ingresoTrigo="|________Trigo________|_____________LPS. 32____________|____________"+contadorTrigoV+"______________|\n";
                                
                                contadorTrigo-=kiloOpcion;
                                totalPreV=32*kiloOpcion;
                                costoV=32;
                                
                            }
                            else if(codigoProducto==4 && (tipoCliente.equalsIgnoreCase("a") || tipoCliente.equalsIgnoreCase("c"))  && contadorMaiz>=kiloOpcion ){
                                
                                contadorMaizV+=kiloOpcion;
                                kgVendidoMaiz+=kiloOpcion;
                                ingresoMaiz="|________Maiz________|______________LPS. 20_____________|____________"+contadorMaizV+"______________|\n";
                                
                                contadorMaiz-=kiloOpcion;
                                totalPreV=20*kiloOpcion;
                                costoV=20;
                                
                            }
                            subtotal+=totalPreV;
                            impuestos=subtotal*0.07;
                            System.out.println(kiloOpcion);
                            
                            System.out.println(subtotal);
                            
                            //descuento
                            if(subtotal<1000){
                                descuentoStr="0%";
                                descuentoV=0;
                            }
                            else if(subtotal>=1000 && totalV<=5000){
                                descuentoStr="5%";
                                descuentoV=totalPreV*0.05;
                            }
                            else if(subtotal>5000){
                                descuentoStr="10%";
                                descuentoV=totalPreV*0.1;
                            }
                            
                            System.out.println("Desea comprar otro producto? 1(si) 2(no)");
                            int repeatOp=lea.nextInt();

                            while(repeatOp!=1 && repeatOp!=2){
                                System.out.println("Error, ingreso una opcion incorrecta. Desea comprar otro producto? 1(si) 2(no)");
                                repeatOp=lea.nextInt();
                            }
                            
                            //producto/s comprado/s(no esta listo), precio por kilogramo(no listo), descuento(listo), ISV(listo), subtotal(listo), total(listo)
                            if(repeatOp==2){
                                
                                listProducts=ingresoAzucar+ingresoAvena+ingresoTrigo+ingresoMaiz;
                                totalV=subtotal-descuentoV+impuestos;
                                System.out.println("--------------Factura--------------"
                                    +"\n________________________________________________________________________________"
                                    +"\n|__Producto comprado__|__Costo unitario por kilogramo__|__Kilogramos comprados__|"
                                    + "\n"+listProducts
                                    + "\nSubtotal: Lps. "+subtotal
                                    + "\nImpuesto 7% ISV: Lps. "+impuestos
                                    + "\nDescuento "+descuentoStr+": Lps. "+descuentoV
                                    + "\nTotal comprado: Lps. "+totalV);
                                volumenVenta+=totalV;
                                caja+=totalV;
                                ingresoAzucar="";
                                ingresoAvena="";
                                ingresoTrigo="";
                                ingresoMaiz="";
                                contadorVenta+=1;
                                if(mayorVenta<totalV){
                                    mayorVenta=totalV;
                                }
                                subtotal=0;
                                break;
                            }
                    }
                }
                    
                    
                
            }
            else if(eleccion==3 && cajaOpen){
                
                if(caja==0){
                    System.out.println("No hay dinero en la caja. Ingrese dinero para poder comprar articulos");
                    continue;
                }
                
                    System.out.println("******************************COMPRAS*****************************");
                    System.out.println("------------------------Tipo de cliente------------------------"+
                    "\n|A: Tiene acceso a proveer articulos de codigo 1 y 4.         |"+
                    "\n|B: Tiene acceso a proveer articulos de codigo 2 y 3.         |"+
                    "\n|C: Tiene acceso a proveer articulos de codigo 2.             |"+
                    "\n---------------------------------------------------------------");
                    tipoCliente=lea.next();

                    while(!tipoCliente.equalsIgnoreCase("a") && !tipoCliente.equalsIgnoreCase("b") && !tipoCliente.equalsIgnoreCase("c")){
                        System.out.println("Ingrese una eleccion valida. A, B o C.");
                        tipoCliente=lea.next();
                    }
                    
                while(true){
                    if(tipoCliente.equalsIgnoreCase("a")){
                        System.out.println("___________________________________________________________________\n" +
                        "|____CODIGO____|__________PRODUCTO__________|________PRECIO________|\n" +
                        "|       1      |           AZUCAR           |       LPS. 25        |\n" +
                        "|_______4______|___________MAIZ_____________|_______LPS. 18________|");
                        
                        System.out.println("Ingrese el codigo de producto:");
                        codigoProducto=lea.nextInt();

                        while(codigoProducto<1 || codigoProducto>4 || codigoProducto==2 || codigoProducto==3){
                            System.out.println("Error. Ingrese uno de los codigos que aparecen en la tabla.");
                            codigoProducto=lea.nextInt();
                        }
                    }
                    else if(tipoCliente.equalsIgnoreCase("b")){
                        System.out.println("___________________________________________________________________\n" +
                        "|____CODIGO____|__________PRODUCTO__________|________PRECIO________|\n" +
                        "|       2      |           AVENA            |       LPS. 20        |\n" +
                        "|_______3______|___________TRIGO____________|_______LPS. 30________|");
                        System.out.println("Ingrese el codigo de producto:");
                        codigoProducto=lea.nextInt();

                        while(codigoProducto<2 || codigoProducto>3){
                            System.out.println("Error. Ingrese uno de los codigos que aparecen en la tabla.");
                            codigoProducto=lea.nextInt();
                        }
                    }
                    else if(tipoCliente.equalsIgnoreCase("c")){
                        System.out.println("___________________________________________________________________\n" +
                        "|____CODIGO____|__________PRODUCTO__________|________PRECIO________|\n" +
                        "|_______2______|___________AVENA____________|________LPS. 22_______|");
                        System.out.println("Ingrese el codigo de producto:");
                        codigoProducto=lea.nextInt();

                        while(codigoProducto!=2){
                            System.out.println("Error. Ingrese uno de los codigos que aparecen en la tabla.");
                            codigoProducto=lea.nextInt();
                        }
                    }
    //              Luego de esto se pedirá ingresar el código del producto a comprar. Si el proveedor posee el producto a comprar se procede 
    //              con la facturación: el programa pedirá ingresar la cantidad en kilogramos a comprar del producto deseado, así obtendremos su total y lo 
    //              mostraremos en pantalla de acuerdo al precio de compra que nos ofrece el proveedor por kilogramo (dado por la tabla en la parte superior). 
    //              Esta compra llegara a disminuir mi efectivo en Caja.

                    

                    System.out.println("--------------------------------------"+
                    "\nIngrese la cantidad de kilogramos que desea comprar del producto:");
                    kiloOpcion=lea.nextDouble();

                    while(kiloOpcion<=0){
                        System.out.println("--------------------------------------"+
                        "\nIngrese la cantidad de kilogramos que desea comprar del producto:");
                        kiloOpcion=lea.nextDouble();
                    }
                    //producto comprado, precio por kilogramo, total
                    if(codigoProducto==1 && tipoCliente.equalsIgnoreCase("a")){
                        contadorAzucar+=kiloOpcion;
                        tipoProducto="Azucar ";
                        totalComp=25*kiloOpcion;
                        costoComp=25;
                    }
                    else if(codigoProducto==2 && tipoCliente.equalsIgnoreCase("b")){
                        contadorAvena+=kiloOpcion;
                        tipoProducto="Avena";
                        totalComp=20*kiloOpcion;
                        costoComp=20;
                    }
                    else if(codigoProducto==2 && tipoCliente.equalsIgnoreCase("c")){
                        contadorAvena+=kiloOpcion;
                        tipoProducto="Avena";
                        totalComp=22*kiloOpcion;
                        costoComp=22;
                    }
                    else if(codigoProducto==3 && tipoCliente.equalsIgnoreCase("b")){
                        contadorTrigo+=kiloOpcion;
                        tipoProducto="Trigo";
                        totalComp=30*kiloOpcion;
                        costoComp=30;
                    }
                    else if(codigoProducto==4 && tipoCliente.equalsIgnoreCase("a")){
                        contadorMaiz+=kiloOpcion;
                        tipoProducto="Maiz";
                        totalComp=18*kiloOpcion;
                        costoComp=18;
                    }
                    if(totalComp>caja){
                        System.out.println("Compra denegada, No tiene suficiente dinero en caja.");
                        break;
                    }
                    
                    System.out.println("--------------Factura--------------"
                            + "\nProducto comprado: "+tipoProducto
                            + "\nCosto de producto por kg: "+costoComp
                            + "\nKilogramos comprados: Kg."+kiloOpcion
                            + "\nTotal comprado: L. "+totalComp);
                    volumenCompra+=totalComp;
                    caja-=totalComp;
                    contadorCompra+=1;
                    if(mayorCompra<totalComp){
                        mayorCompra=totalComp;
                    }
                    break;
//                    System.out.println("Desea comprar otro producto? 1(si) 2(no)");
//                    int repeatOp=lea.nextInt();
//
//                    while(repeatOp!=1 && repeatOp!=2){
//                        System.out.println("Error, ingreso una opcion incorrecta. Desea comprar otro producto? 1(si) 2(no)");
//                        repeatOp=lea.nextInt();
//                    }
//                    if(repeatOp==1){
//                        System.out.println("Tocan los calculos");
//                    }
//                    if(repeatOp==2){
//                        break;
//                    }
                    
                }
                
            }
            
            else if(eleccion==4){
                
                //producto estrella y producto numero uno
                if(kgVendidoAzucar>=kgVendidoAvena && kgVendidoAzucar>=kgVendidoTrigo && kgVendidoAzucar>=kgVendidoMaiz){
                    productoEstrella+="|Producto estrella: Azucar\nCantidad de kilogramos vendidos: "+kgVendidoAzucar;
                }
                else if(kgVendidoAvena>=kgVendidoAzucar && kgVendidoAvena>=kgVendidoTrigo && kgVendidoAvena>=kgVendidoMaiz){
                    productoEstrella+="|Producto estrella: Avena\nCantidad de kilogramos vendidos: "+kgVendidoAvena;
                }
                else if(kgVendidoTrigo>=kgVendidoAzucar && kgVendidoTrigo>=kgVendidoAvena && kgVendidoTrigo>=kgVendidoMaiz){
                    productoEstrella+="|Producto estrella: Trigo\nCantidad de kilogramos vendidos: "+kgVendidoTrigo;
                }
                else if(kgVendidoMaiz>=kgVendidoAvena && kgVendidoMaiz>=kgVendidoTrigo && kgVendidoMaiz>=kgVendidoAzucar){
                    productoEstrella+="|Producto estrella: Maiz\nCantidad de kilogramos vendidos: "+kgVendidoMaiz;
                }
                else if(kgVendidoAzucar==0 && kgVendidoAvena==0 && kgVendidoTrigo==0 && kgVendidoMaiz==0){
                    productoEstrella+="|No hay producto estrella, aun no se han realizado ventas.";
                }
                
                if (kgVendidoAvena >= kgVendidoAzucar && kgVendidoAvena >= kgVendidoTrigo && kgVendidoAvena >= kgVendidoMaiz) {
                    firstPlace = "|1. Avena kg: " + kgVendidoAvena;

                    if (kgVendidoAzucar >= kgVendidoTrigo && kgVendidoAzucar >= kgVendidoMaiz) {
                        secondPlace = "|2. Azucar kg: " + kgVendidoAzucar;
                        if (kgVendidoTrigo >= kgVendidoMaiz) {
                            thirdPlace = "|3. Trigo kg: " + kgVendidoTrigo;
                            fourthPlace = "|4. Maiz kg: " + kgVendidoMaiz;
                        } else {
                            thirdPlace = "|3. Maiz kg: " + kgVendidoMaiz;
                            fourthPlace = "|4. Trigo kg: " + kgVendidoTrigo;
                        }
                    } else if (kgVendidoTrigo >= kgVendidoAzucar && kgVendidoTrigo >= kgVendidoMaiz) {
                        secondPlace = "|2. Trigo kg: " + kgVendidoTrigo;
                        if (kgVendidoAzucar >= kgVendidoMaiz) {
                            thirdPlace = "|3. Azucar kg: " + kgVendidoAzucar;
                            fourthPlace = "|4. Maiz kg: " + kgVendidoMaiz;
                        } else {
                            thirdPlace = "|3. Maiz kg: " + kgVendidoMaiz;
                            fourthPlace = "|4. Azucar kg: " + kgVendidoAzucar;
                        }
                    } else {
                        secondPlace = "|2. Maiz kg: " + kgVendidoMaiz;
                        thirdPlace = "|3. Azucar kg: " + kgVendidoAzucar;
                        fourthPlace = "|4. Trigo kg: " + kgVendidoTrigo;
                    }
                } else if (kgVendidoAzucar >= kgVendidoAvena && kgVendidoAzucar >= kgVendidoTrigo && kgVendidoAzucar >= kgVendidoMaiz) {
                    firstPlace = "|1. Azucar kg: " + kgVendidoAzucar;

                    if (kgVendidoAvena >= kgVendidoTrigo && kgVendidoAvena >= kgVendidoMaiz) {
                        secondPlace = "|2. Avena kg: " + kgVendidoAvena;
                        if (kgVendidoTrigo >= kgVendidoMaiz) {
                            thirdPlace = "|3. Trigo kg: " + kgVendidoTrigo;
                            fourthPlace = "|4. Maiz kg: " + kgVendidoMaiz;
                        } else {
                            thirdPlace = "|3. Maiz kg: " + kgVendidoMaiz;
                            fourthPlace = "|4. Trigo kg: " + kgVendidoTrigo;
                        }
                    } else if (kgVendidoTrigo >= kgVendidoAvena && kgVendidoTrigo >= kgVendidoMaiz) {
                        secondPlace = "|2. Trigo kg: " + kgVendidoTrigo;
                        if (kgVendidoAvena >= kgVendidoMaiz) {
                            thirdPlace = "|3. Avena kg: " + kgVendidoAvena;
                            fourthPlace = "|4. Maiz kg: " + kgVendidoMaiz;
                        } else {
                            thirdPlace = "|3. Maiz kg: " + kgVendidoMaiz;
                            fourthPlace = "|4. Avena kg: " + kgVendidoAvena;
                        }
                    } else {
                        secondPlace = "|2. Maiz kg: " + kgVendidoMaiz;
                        thirdPlace = "|3. Avena kg: " + kgVendidoAvena;
                        fourthPlace = "|4. Trigo kg: " + kgVendidoTrigo;
                    }
                } else if (kgVendidoTrigo >= kgVendidoAvena && kgVendidoTrigo >= kgVendidoAzucar && kgVendidoTrigo >= kgVendidoMaiz) {
                    firstPlace = "|1. Trigo kg: " + kgVendidoTrigo;

                    if (kgVendidoAvena >= kgVendidoAzucar && kgVendidoAvena >= kgVendidoMaiz) {
                        secondPlace = "|2. Avena kg: " + kgVendidoAvena;
                        if (kgVendidoAzucar >= kgVendidoMaiz) {
                            thirdPlace = "|3. Azucar kg: " + kgVendidoAzucar;
                            fourthPlace = "|4. Maiz kg: " + kgVendidoMaiz;
                        } else {
                            thirdPlace = "|3. Maiz kg: " + kgVendidoMaiz;
                            fourthPlace = "|4. Azucar kg: " + kgVendidoAzucar;
                        }
                    } else if (kgVendidoAzucar >= kgVendidoAvena && kgVendidoAzucar >= kgVendidoMaiz) {
                        secondPlace = "|2. Azucar kg: " + kgVendidoAzucar;
                        if (kgVendidoAvena >= kgVendidoMaiz) {
                            thirdPlace = "|3. Avena kg: " + kgVendidoAvena;
                            fourthPlace = "|4. Maiz kg: " + kgVendidoMaiz;
                        } else {
                            thirdPlace = "|3. Maiz kg: " + kgVendidoMaiz;
                            fourthPlace = "|4. Avena kg: " + kgVendidoAvena;
                        }
                    } else {
                        secondPlace = "|2. Maiz kg: " + kgVendidoMaiz;
                        thirdPlace = "|3. Avena kg: " + kgVendidoAvena;
                        fourthPlace = "|4. Azucar kg: " + kgVendidoAzucar;
                    }
                } else {
                    firstPlace = "|1. Maiz kg: " + kgVendidoMaiz;

                    if (kgVendidoAvena >= kgVendidoAzucar && kgVendidoAvena >= kgVendidoTrigo) {
                        secondPlace = "|2. Avena kg: " + kgVendidoAvena;
                        if (kgVendidoAzucar >= kgVendidoTrigo) {
                            thirdPlace = "|3. Azucar kg: " + kgVendidoAzucar;
                            fourthPlace = "|4. Trigo kg: " + kgVendidoTrigo;
                        } else {
                            thirdPlace = "|3. Trigo kg: " + kgVendidoTrigo;
                            fourthPlace = "|4. Azucar kg: " + kgVendidoAzucar;
                        }
                    } else if (kgVendidoAzucar >= kgVendidoAvena && kgVendidoAzucar >= kgVendidoTrigo) {
                        secondPlace = "|2. Azucar kg: " + kgVendidoAzucar;
                        if (kgVendidoAvena >= kgVendidoTrigo) {
                            thirdPlace = "|3. Avena kg: " + kgVendidoAvena;
                            fourthPlace = "|4. Trigo kg: " + kgVendidoTrigo;
                        } else {
                            thirdPlace = "|3. Trigo kg: " + kgVendidoTrigo;
                            fourthPlace = "|4. Avena kg: " + kgVendidoAvena;
                        }
                    } else {
                        secondPlace = "|2. Trigo kg: " + kgVendidoTrigo;
                        thirdPlace = "|3. Avena kg: " + kgVendidoAvena;
                        fourthPlace = "|4. Azucar kg: " + kgVendidoAzucar;
                    }
                }
                
//                //Numero 1
//                
//                if(kgVendidoAzucar>kgVendidoAvena && kgVendidoAzucar>kgVendidoTrigo && kgVendidoAzucar>kgVendidoMaiz){
//                    firstPlace="|1. Azucar kg: "+kgVendidoAzucar;
//                }
//                else if(kgVendidoAvena>kgVendidoAzucar && kgVendidoAvena>kgVendidoTrigo && kgVendidoAvena>kgVendidoMaiz){
//                    firstPlace="|1. Avena kg: "+kgVendidoAvena;
//                }
//                else if(kgVendidoTrigo>kgVendidoAzucar && kgVendidoTrigo>kgVendidoAvena && kgVendidoTrigo>kgVendidoMaiz){
//                    firstPlace="|1. Trigo kg: "+kgVendidoTrigo;
//                }
//                else if(kgVendidoMaiz>kgVendidoAvena && kgVendidoMaiz>kgVendidoTrigo && kgVendidoMaiz>kgVendidoAzucar){
//                    firstPlace="|1. Maiz kg: "+kgVendidoMaiz;
//                }
//                
//                
//                
//                //producto numero dos
//                if((kgVendidoAzucar < kgVendidoAvena && kgVendidoAzucar > kgVendidoTrigo && kgVendidoAzucar > kgVendidoMaiz) || 
//                   (kgVendidoAzucar < kgVendidoTrigo && kgVendidoAzucar > kgVendidoAvena && kgVendidoAzucar > kgVendidoMaiz) || 
//                   (kgVendidoAzucar < kgVendidoMaiz && kgVendidoAzucar < kgVendidoAvena && kgVendidoAzucar > kgVendidoTrigo)){
//                    secondPlace="|2. Azucar kg: "+kgVendidoAzucar;
//                }
//                
//                else if((kgVendidoAvena<kgVendidoAzucar && kgVendidoAvena>kgVendidoTrigo && kgVendidoAvena>kgVendidoMaiz) || 
//                        (kgVendidoAvena<kgVendidoTrigo && kgVendidoAvena>kgVendidoAzucar && kgVendidoAvena>kgVendidoMaiz) || 
//                        (kgVendidoAvena<kgVendidoMaiz && kgVendidoAzucar>kgVendidoAzucar && kgVendidoAzucar>kgVendidoMaiz)){
//                    secondPlace="|2. Avena kg: "+kgVendidoAvena;
//                }
//                
//                else if((kgVendidoTrigo<kgVendidoAzucar && kgVendidoTrigo>kgVendidoAvena && kgVendidoTrigo>kgVendidoMaiz) || 
//                        (kgVendidoTrigo>kgVendidoAvena && kgVendidoTrigo<kgVendidoAzucar && kgVendidoTrigo>kgVendidoMaiz) || 
//                        (kgVendidoTrigo<kgVendidoMaiz && kgVendidoTrigo<kgVendidoAzucar && kgVendidoTrigo>kgVendidoAvena)){
//                    secondPlace="|2. Trigo kg: "+kgVendidoTrigo;
//                }
//                
//                else if((kgVendidoMaiz<kgVendidoAzucar && kgVendidoMaiz>kgVendidoTrigo && kgVendidoMaiz>kgVendidoAvena) || 
//                        (kgVendidoMaiz>kgVendidoAvena && kgVendidoMaiz<kgVendidoTrigo && kgVendidoMaiz>kgVendidoAzucar) || 
//                        (kgVendidoMaiz<kgVendidoTrigo && kgVendidoMaiz>kgVendidoAzucar && kgVendidoMaiz>kgVendidoAvena)){
//                    secondPlace="|2. Maiz kg: "+kgVendidoMaiz;
//                }
//                
//                //tercer puesto
//                
//                if((kgVendidoAzucar<kgVendidoAvena && kgVendidoAzucar<kgVendidoTrigo && kgVendidoAzucar>kgVendidoMaiz) || 
//                   (kgVendidoAzucar<kgVendidoTrigo && kgVendidoAzucar<kgVendidoMaiz && kgVendidoAzucar>kgVendidoAvena) || 
//                   (kgVendidoAzucar<kgVendidoMaiz && kgVendidoAzucar<kgVendidoAvena && kgVendidoAzucar>kgVendidoTrigo)){
//                    thirdPlace="|3. Azucar kg: "+kgVendidoAzucar;
//                }
//                
//                else if((kgVendidoAvena<kgVendidoAzucar && kgVendidoAvena<kgVendidoTrigo && kgVendidoAvena>kgVendidoMaiz) || 
//                        (kgVendidoAvena<kgVendidoAzucar && kgVendidoAvena<kgVendidoMaiz && kgVendidoAvena>kgVendidoTrigo) || 
//                        (kgVendidoAvena<kgVendidoMaiz && kgVendidoAvena<kgVendidoTrigo && kgVendidoAvena>kgVendidoAzucar)){
//                    thirdPlace="|3. Avena kg: "+kgVendidoAvena;
//                }
//                
//                else if((kgVendidoTrigo<kgVendidoAzucar && kgVendidoTrigo<kgVendidoAvena && kgVendidoTrigo>kgVendidoMaiz) || 
//                        (kgVendidoTrigo<kgVendidoAzucar && kgVendidoTrigo<kgVendidoMaiz && kgVendidoTrigo>kgVendidoAvena) || 
//                        (kgVendidoTrigo<kgVendidoMaiz && kgVendidoTrigo<kgVendidoAvena && kgVendidoTrigo>kgVendidoAzucar)){
//                    thirdPlace="|3. Trigo kg: "+kgVendidoTrigo;
//                }
//                
//                else if((kgVendidoMaiz<kgVendidoAzucar && kgVendidoMaiz<kgVendidoAvena && kgVendidoMaiz>kgVendidoTrigo) || 
//                        (kgVendidoMaiz<kgVendidoAzucar && kgVendidoMaiz<kgVendidoTrigo && kgVendidoMaiz>kgVendidoAvena) || 
//                        (kgVendidoMaiz<kgVendidoTrigo && kgVendidoMaiz<kgVendidoAvena && kgVendidoMaiz>kgVendidoAzucar)){
//                    thirdPlace="|3. Maiz kg: "+kgVendidoMaiz;
//                }
//                
//                //Quarto puesto
//                
//                if(kgVendidoAzucar<kgVendidoAvena && kgVendidoAzucar<kgVendidoTrigo && kgVendidoAzucar<kgVendidoMaiz){
//                    fourthPlace="|4. Azucar kg: "+kgVendidoAzucar;
//                }
//                
//                else if(kgVendidoAvena<kgVendidoAzucar && kgVendidoAvena<kgVendidoTrigo && kgVendidoAvena<kgVendidoMaiz){
//                    fourthPlace="|4. Avena kg: "+kgVendidoAvena;
//                }
//                
//                else if(kgVendidoTrigo<kgVendidoAzucar && kgVendidoTrigo<kgVendidoAvena && kgVendidoTrigo<kgVendidoMaiz){
//                    fourthPlace="|4. Trigo kg: "+kgVendidoTrigo;
//                }
//                
//                else if(kgVendidoMaiz<kgVendidoAzucar && kgVendidoMaiz<kgVendidoAvena && kgVendidoMaiz<kgVendidoTrigo){
//                    fourthPlace="|4. Maiz kg: "+kgVendidoMaiz;
//                }
                
                System.out.println("-----------------------------Reportes-----------------------------\n"
                                  +"|Cantidad actual de caja: Lps. "+caja+"                                 \n"
                                  +"|```````````````````Numeros de compras y ventas```````````````````\n"
                                  +"|Numero de compras: "+contadorCompra+"                                  \n"
                                  +"|Numero de ventas: "+contadorVenta+"                                    \n"
                                  +"|`````````Volumen de compras, ventas y margen de ganancia`````````\n"
                                  +"|Volumen de compras: Lps. "+volumenCompra+"\n"
                                  +"|Volumen de ventas: Lps. "+volumenVenta+"\n"
                                  +"|Margen de ganancias: "+Math.round((volumenVenta-volumenCompra)/volumenVenta)*100+"%(Lps. "+Math.round(volumenVenta-volumenCompra)+")\n"
                                  +"|``````````````````Valor Medio de Compra y Venta``````````````````\n"
                                  +"|Valor medio de compras: Lps. "+Math.round(volumenCompra/contadorCompra)+"\n"
                                  +"|Valor medio de ventas: Lps. "+Math.round(volumenVenta/contadorVenta)+"\n"
                                  +"|```````````````````````Venta y compra mayor```````````````````````\n"
                                  +"|Venta mayor: Lps. "+mayorVenta+"\n"
                                  +"|Compra mayor: Lps. "+mayorCompra+"\n"
                                  //Producto Estrella. Cuál es el producto que MAS se vendió en el día. 
                                  //Se necesita mostrar el nombre del producto y cantidad en kilogramos
                                  +"|````````````````````````Producto estrella`````````````````````````\n"
                                  +"|"+productoEstrella+"\n"
                                  +"|``````````````````````````````Ranking`````````````````````````````\n"
                                  +firstPlace+"\n"
                                  +secondPlace+"\n"
                                  +thirdPlace+"\n"
                                  +fourthPlace+"\n"
                                  +"|------------------------------------------------------------------");
                productoEstrella="";
            }
            
            else if(eleccion==5){
                System.out.println("Desea realizar el cierre de caja? 1(si), 2(no)");
                int opcionCaja=lea.nextInt();
                
                if (opcionCaja==1){
                    System.out.println("Dinero en caja: Lps. "+ caja+"\n"
                    + "Para finalizar el cierre de caja ingrese la cantidad de dinero que desea depositar en el banco.\n"
                    + "(Un maximo del 60% se puede depositar en el banco): Lps. ");
                    int deposito=lea.nextInt();
                    
                    while(deposito>0.6*caja || deposito<0){
                    System.out.println("Error. Ingreso una cantidad mayor al 60% o ingreso cantidades negativas.\n"
                    + "Ingrese la cantidad que desea depositar: Lps. ");
                    deposito=lea.nextInt();
                    }
                    caja-=deposito;
                    cajaOpen=false;
                    contadorCaja=1;
                }
                
                else if (opcionCaja==2){
                    System.out.println("Cierre de caja cancelado.");
                }
            }
        }
    }
}