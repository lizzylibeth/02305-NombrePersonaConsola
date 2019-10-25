/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        String nombre;

        try {

            //Leer Dato
            System.out.print("Me llamo .................: ");
            nombre = SCN.next();

            //Mensaje
            System.out.printf(Locale.ENGLISH, "Me llamo .................: %1$s - %1$S - %1$.1S%n", nombre);

        } catch (Exception e) {

            //Mensaje
            System.out.println("ERROR: Entrada Incorrecta");

        } finally {
            //Borrar buffer
            SCN.nextLine();
        }//finally 

    }//main

}//class
