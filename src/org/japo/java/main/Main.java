/* 
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
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
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Referencias
        final int NUMERO_ESTACIONES = 4;
        final double NIVEL_MAX = 0.7;
        final double NIVEL_MIN = 0.0;
        
        // Objeto Random
        Random rnd = new Random();

        // Bucle
        for (int i = 0; i < NUMERO_ESTACIONES; i++) {
            // Genera la letra
            double d = rnd.nextDouble() * (NIVEL_MAX - NIVEL_MIN) + NIVEL_MIN;

            // Mensaje de salida
            System.out.printf(Locale.ENGLISH, "Estación %d ...: %.2f g NO2\n", i + 1, d);
        }
    }
}
