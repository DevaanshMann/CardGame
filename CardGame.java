import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import tools.Colors;
import tools.Symbols;

public class CardGame {


        LinkedList<Integer> userCards = new LinkedList<>();
        LinkedList<Integer> computerCards = new LinkedList<>();
        LinkedList<Integer> cards = new LinkedList<>();


        int LoadGame[][][] = {

                // Card 1
            
                {{90,68,68,68,68,68,68,68,68,68,68,68,68,68,63,},
            
                {51,0,0,0,0,0,0,0,0,0,0,0,1,0,51},
            
                {51,0,0,0,91,91,0,0,0,91,91,0,0,0,51},
            
                {51,0,0,0,0,0,0,0,0,0,0,0,0,0,51},
            
                {51,0,0,0,0,0,0,0,0,0,0,0,0,0,51},
            
                {51,0,0,91,91,91,91,91,91,91,91,91,0,0,51},
            
                {51,0,0,0,91,91,0,0,0,91,91,0,0,0,51},
            
                {51,0,0,0,0,91,91,91,91,91,0,0,0,0,51},
            
                {51,0,1,0,0,0,0,0,0,0,0,0,0,0,51},
            
                {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89}},
            
                // Card 2
                
                {{90,68,68,68,68,68,68,68,68,68,68,68,68,68,63,},
            
                {51,0,0,0,51,68,68,69,68,68,51,0,2,0,51},
            
                {51,0,0,0,51,0,0,69,0,0,51,0,0,0,51},
            
                {51,0,0,0,51,0,0,69,0,0,51,0,0,0,51},
            
                {51,0,0,0,51,0,0,69,0,0,51,0,0,0,51},
            
                {51,0,0,0,51,0,0,69,0,0,51,0,0,0,51},
            
                {51,0,0,0,51,0,0,69,0,0,51,0,0,0,51},
            
                {51,0,0,0,51,0,0,69,0,0,51,0,0,0,51},
            
                {51,0,2,0,51,68,68,69,68,68,51,0,0,0,51},
            
                {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89}},
            
                // Card 3
            
                {{90,68,68,68,68,68,68,68,68,68,68,68,68,68,63,},
            
                {51,0,0,0,0,0,0,0,0,0,0,0,3,0,51},
            
                {51,0,0,50,50,50,50,0,50,50,50,50,0,0,51},
            
                {51,0,50,50,50,50,50,50,50,50,50,50,50,0,51},
            
                {51,0,50,50,50,50,50,50,50,50,50,50,50,0,51},
            
                {51,0,0,50,50,50,50,50,50,50,50,50,0,0,51},
            
                {51,0,0,0,50,50,50,50,50,50,50,0,0,0,51},
            
                {51,0,0,0,0,50,50,50,50,50,0,0,0,0,51},
            
                {51,0,3,0,0,0,0,50,0,0,0,0,0,0,51},
            
                {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89}},
            
                // Card 4
            
                {{90,68,68,68,68,68,68,68,68,68,68,68,68,68,63},
            
                {51,0,0,0,0,0,0,0,0,0,0,0,4,0,51},
            
                {51,0,91,91,91,91,91,91,91,91,91,91,91,0,51},
            
                {51,0,0,91,91,91,91,91,91,91,91,91,0,0,51},
            
                {51,0,0,0,112,112,112,112,112,112,112,0,0,0,51},
            
                {51,0,0,0,112,112,112,112,112,112,112,0,0,0,51},
            
                {51,0,0,91,91,91,91,91,91,91,91,91,0,0,51},
            
                {51,0,91,91,91,91,91,91,91,91,91,91,91,0,51},
            
                {51,0,4,0,0,0,0,0,0,0,0,0,0,0,51},
            
                {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89}},
            
                // Card 5
            
                {{90,68,68,68,68,68,68,68,68,68,68,68,68,68,63,},
            
                {51,0,0,0,0,0,0,0,0,0,0,0,5,0,51},
            
                {51,0,0,0,0,0,0,91,0,0,0,0,0,0,51},
            
                {51,0,0,0,0,0,91,91,91,0,0,0,0,0,51},
            
                {51,0,0,0,0,91,91,91,91,91,0,0,0,0,51},
            
                {51,0,0,0,91,91,91,91,91,91,91,0,0,0,51},
            
                {51,0,0,91,91,91,91,91,91,91,91,91,0,0,51},
            
                {51,0,0,0,0,0,0,91,0,0,0,0,5,0,51},
            
                {51,0,5,0,0,0,0,0,0,0,0,0,0,0,51},
            
                {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89}},
            
                // Card 6
            
                {{90,68,68,68,68,68,68,68,68,68,68,68,68,68,63,},
            
                {51,0,0,0,0,0,0,0,0,0,0,0,6,0,51},
            
                {51,0,0,0,0,0,0,91,0,0,0,0,0,0,51},
            
                {51,0,0,0,0,0,91,91,91,0,0,0,0,0,51},
            
                {51,0,0,91,91,91,91,91,91,91,91,91,0,0,51},
            
                {51,0,0,0,0,0,91,91,91,0,0,0,0,0,51},
            
                {51,0,0,0,0,0,0,91,0,0,0,0,0,0,51},
            
                {51,0,68,68,68,68,68,68,68,68,68,68,68,0,51},
            
                {51,0,6,0,0,0,0,0,0,0,0,0,0,0,51},
            
                {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89}},
            
                // Card 7
            
                {{90,68,68,68,68,68,68,68,68,68,68,68,68,68,63,},
            
                {51,0,0,0,0,0,0,0,0,0,0,0,7,0,51},
            
                {51,0,91,91,91,91,91,91,91,91,91,91,91,0,51},
            
                {51,0,91,91,91,91,91,91,91,91,91,91,91,0,51},
            
                {51,0,91,91,91,91,91,91,91,91,0,0,0,0,51},
            
                {51,0,91,91,91,91,91,91,0,0,0,0,0,0,51},
            
                {51,0,91,91,91,0,0,0,0,0,0,0,0,0,51},
            
                {51,0,91,91,91,0,0,0,0,0,0,0,0,0,51},
            
                {51,0,7,0,0,0,0,0,0,0,0,0,0,0,51},
            
                {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89}},
            
                // Card 8
            
                {{90,68,68,68,68,68,68,68,68,68,68,68,68,68,63,},
            
                {51,0,0,0,0,0,0,0,0,0,0,0,8,0,51},
            
                {51,0,0,0,0,0,0,0,0,0,91,91,91,0,51},
            
                {51,0,0,0,0,0,0,0,91,91,91,91,91,0,51},
            
                {51,0,0,0,0,0,91,91,91,91,91,91,91,0,51},
            
                {51,0,0,0,91,91,91,91,91,91,91,91,91,0,51},
            
                {51,0,91,91,91,91,91,91,91,91,91,91,91,0,51},
            
                {51,0,91,91,91,91,91,91,91,91,91,91,91,0,51},
            
                {51,0,8,0,0,0,0,0,0,0,0,0,0,0,51},
            
                {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89}},
            
                // Card 9
            
                {{90,68,68,68,68,68,68,68,68,68,68,68,68,68,63,},
            
                {51,0,0,0,0,0,0,0,0,0,0,0,9,0,51},
            
                {51,0,0,0,0,0,0,0,0,0,91,91,91,0,51},
            
                {51,0,0,0,0,0,0,0,91,91,91,91,91,0,51},
            
                {51,0,0,0,0,0,91,91,91,91,91,91,91,0,51},
            
                {51,0,0,0,91,91,91,91,91,91,91,91,91,0,51},
            
                {51,0,91,91,91,91,91,91,91,91,91,91,91,0,51},
            
                {51,0,91,91,91,0,0,0,0,0,0,0,0,0,51},
            
                {51,0,9,0,0,0,0,0,0,0,0,0,0,0,51},
            
                {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89}},
            
                // Card 10
            
                {{90,68,68,68,68,68,68,68,68,68,68,68,68,68,63,},
            
                {51,0,0,0,0,0,0,0,0,0,0,0,10,0,51},
            
                {51,0,0,0,0,95,91,91,91,95,0,0,0,0,51},
            
                {51,0,0,0,0,0,0,91,0,0,0,0,0,0,51},
            
                {51,0,91,91,91,91,91,91,91,91,91,91,91,0,51},
            
                {51,0,91,91,0,0,0,0,0,0,0,91,91,0,51},
            
                {51,0,91,91,0,0,0,0,0,0,0,91,91,0,51},
            
                {51,0,91,91,91,91,91,91,91,91,91,91,91,0,51},
            
                {51,0,10,0,0,0,0,0,0,0,0,0,0,0,51},
            
                {64,68,68,68,68,68,68,68,68,68,68,68,68,68,89}}
            
            
            };
            
            String fontcolor[][][] = {
            
                // Card 1
            
               { {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
               {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
               {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.BLACK,Colors.BLUE,Colors.BLUE,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLUE,Colors.BLUE,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
               {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
               {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
               {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.BLUE,Colors.BLUE,Colors.BLUE,Colors.BLUE,Colors.BLUE,Colors.BLUE,Colors.BLUE,Colors.BLUE,Colors.BLUE,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
               {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.BLUE,Colors.BLUE,Colors.RED,Colors.RED,Colors.RED,Colors.BLUE,Colors.BLUE,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
               {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.BLUE,Colors.BLUE,Colors.BLUE,Colors.BLUE,Colors.BLUE,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
               {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK}},
            
              // Card 2
            
                { {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                 {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK} },
             
                // Card 3
            
                { {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                 {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK} },
            
                // Card 4
            
                { {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                 {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK}},
            
                // Card 5
                
                 {{Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
                 {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
              
                 {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.GREEN,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
              
                 {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
              
                 {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
              
                 {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
              
                 {Colors.BLACK,Colors.BLACK,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.BLACK,Colors.BLACK},
              
                 {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
              
                 {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
              
                  {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK}},
            
                // Card 6
            
                {{Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.YELLOW,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                 {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK}},
            
                // Card 7
            
                {{Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.WHITE,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.GREEN,Colors.GREEN,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.GREEN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                 {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK}},
            
                // Card 8
            
                {{Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.PURPLE,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.WHITE,Colors.WHITE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.PURPLE,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                 {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK}},
            
                // Card 9
            
                {{Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.WHITE,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.WHITE,Colors.WHITE,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.RED,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.RED,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                 {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK}},
            
                // Card 10
            
                {{Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
            
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK},
             
                 {Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK,Colors.BLACK}} 
            
            
            };
            
            String bgcolor[][][] = {
            
                { {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
                {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
                {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
                {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
                {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
                {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
                {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.RED_BACKGROUND,Colors.RED_BACKGROUND,Colors.RED_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
                {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
                {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
                {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND}
            
            
             },
            
             { {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
             {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
             {Colors.RED_BACKGROUND,Colors.RED_BACKGROUND,Colors.RED_BACKGROUND,Colors.RED_BACKGROUND,Colors.RED_BACKGROUND,Colors.RED_BACKGROUND,Colors.RED_BACKGROUND,Colors.RED_BACKGROUND,Colors.RED_BACKGROUND,Colors.RED_BACKGROUND,Colors.RED_BACKGROUND,Colors.RED_BACKGROUND,Colors.RED_BACKGROUND,Colors.RED_BACKGROUND,Colors.RED_BACKGROUND},
            
             {Colors.YELLOW_BACKGROUND,Colors.YELLOW_BACKGROUND,Colors.YELLOW_BACKGROUND,Colors.YELLOW_BACKGROUND,Colors.YELLOW_BACKGROUND,Colors.YELLOW_BACKGROUND,Colors.YELLOW_BACKGROUND,Colors.YELLOW_BACKGROUND,Colors.YELLOW_BACKGROUND,Colors.YELLOW_BACKGROUND,Colors.YELLOW_BACKGROUND,Colors.YELLOW_BACKGROUND,Colors.YELLOW_BACKGROUND,Colors.YELLOW_BACKGROUND,Colors.YELLOW_BACKGROUND},
            
             {Colors.GREEN_BACKGROUND,Colors.GREEN_BACKGROUND,Colors.GREEN_BACKGROUND,Colors.GREEN_BACKGROUND,Colors.GREEN_BACKGROUND,Colors.GREEN_BACKGROUND,Colors.GREEN_BACKGROUND,Colors.GREEN_BACKGROUND,Colors.GREEN_BACKGROUND,Colors.GREEN_BACKGROUND,Colors.GREEN_BACKGROUND,Colors.GREEN_BACKGROUND,Colors.GREEN_BACKGROUND,Colors.GREEN_BACKGROUND,Colors.GREEN_BACKGROUND},
            
             {Colors.BLUE_BACKGROUND,Colors.BLUE_BACKGROUND,Colors.BLUE_BACKGROUND,Colors.BLUE_BACKGROUND,Colors.BLUE_BACKGROUND,Colors.BLUE_BACKGROUND,Colors.BLUE_BACKGROUND,Colors.BLUE_BACKGROUND,Colors.BLUE_BACKGROUND,Colors.BLUE_BACKGROUND,Colors.BLUE_BACKGROUND,Colors.BLUE_BACKGROUND,Colors.BLUE_BACKGROUND,Colors.BLUE_BACKGROUND,Colors.BLUE_BACKGROUND},
            
             {Colors.PURPLE_BACKGROUND,Colors.PURPLE_BACKGROUND,Colors.PURPLE_BACKGROUND,Colors.PURPLE_BACKGROUND,Colors.PURPLE_BACKGROUND,Colors.PURPLE_BACKGROUND,Colors.PURPLE_BACKGROUND,Colors.PURPLE_BACKGROUND,Colors.PURPLE_BACKGROUND,Colors.PURPLE_BACKGROUND,Colors.PURPLE_BACKGROUND,Colors.PURPLE_BACKGROUND,Colors.PURPLE_BACKGROUND,Colors.PURPLE_BACKGROUND,Colors.PURPLE_BACKGROUND},
            
             {Colors.CYAN_BACKGROUND,Colors.CYAN_BACKGROUND,Colors.CYAN_BACKGROUND,Colors.CYAN_BACKGROUND,Colors.CYAN_BACKGROUND,Colors.CYAN_BACKGROUND,Colors.CYAN_BACKGROUND,Colors.CYAN_BACKGROUND,Colors.CYAN_BACKGROUND,Colors.CYAN_BACKGROUND,Colors.CYAN_BACKGROUND,Colors.CYAN_BACKGROUND,Colors.CYAN_BACKGROUND,Colors.CYAN_BACKGROUND,Colors.CYAN_BACKGROUND},
            
             {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
             {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND} },
            
            
            
             { {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
             {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
             {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
             {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
             {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
             {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
             {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
             {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
             {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
             {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND}},
            
            
            
            { {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND}},
            
            
            {{Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND}},
            
            
            {{Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND}},
            
            
            {{Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND}},
            
            
            {{Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND}},
            
            
            {{Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND}},
            
            
            {{Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND},
            
            {Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND,Colors.WHITE_BACKGROUND}}
            
            };


    public static final char getAscii(int code) 
    {
            return Symbols.EXTENDED[code];
    }


    public static final void printChar(int ascii) 
    {
        System.out.printf("%c%n", getAscii(ascii) );
    }
    public static void printxy(int col, int row, String val)
    {
        char escCode = 0x1B;
        System.out.print(String.format("%s[%d;%df",escCode,row,col));
        System.out.print(val);
    }


    public static void Box(int x, int y, int w, int h, int ascii, String fcolor,String bcolor)
    {
        char val = getAscii(ascii);
        for (int i=0; i < w; i++)
        {
            for (int j=0; j< h; j++)
            {
                
                printxy(x+i,y+j,fcolor + bcolor + val);
            }
        }
    }


    public void DisplayCard(int x, int y, int cardNumber) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                // System.out.print(card[i][j]);
                if (LoadGame[cardNumber][i][j] == 0) {
                    printxy(x+j, y+i, " ");
                    printxy(x + j, y + i, String.valueOf(fontcolor[cardNumber][i][j] + bgcolor[cardNumber][i][j]));
                } else if ((LoadGame[cardNumber][i][j] >= 1) && (LoadGame[cardNumber][i][j] <= 9)) {
                    printxy(x + j, y + i, String.valueOf(fontcolor[cardNumber][i][j] + bgcolor[cardNumber][i][j]
                            + LoadGame[cardNumber][i][j]));          
                } 
                else if ((LoadGame[cardNumber][i][j] == 10)) {
                    printxy(x + j - 1, y + i, fontcolor[cardNumber][i][j] + bgcolor[cardNumber][i][j]
                            + "1");
                    printxy(x + j, y + i, fontcolor[cardNumber][i][j] + bgcolor[cardNumber][i][j]
                    + "0");
                }
                else {
                    printxy(x + j, y + i, String.valueOf(fontcolor[cardNumber][i][j] + bgcolor[cardNumber][i][j]
                            + Symbols.EXTENDED[LoadGame[cardNumber][i][j]]));
                }
            }
        }
    }


        public void cls()
        {
                    // cls
            System.out.print("\033[H\033[2J");  
            System.out.flush(); 
        }


        void PrintNumbers(int x, int y, LinkedList<Integer> numbers) {
            for (int i = 0; i < numbers.size(); i++) {
                    DisplayCard(x,y, numbers.get(i)-1);
                    x += 15;
            }
        }


        void DisplayDeck() {
            cls();
            printxy(0,2, "Computer");
            PrintNumbers(10,2,computerCards);
            printxy(0,25, "User");
            PrintNumbers(10,25,userCards);
        }


        int GetComputerNumber()
        {
            Random rand = new Random();
            int index = rand.nextInt(computerCards.size());
            int randValue = computerCards.get(index);
            return randValue;
        }
        public static int getRandomInteger(int maximum, int minimum){ 
            return ((int) (Math.random()*(maximum - minimum))) + minimum;
        }


        void ShuffleDeck() {
            for (int i = 0; i < 5; i++){
                int index = getRandomInteger(11, 1);
                while (userCards.contains(index)){
                    index = getRandomInteger(11, 1);
                }
                userCards.add(index);
            }
            for (int i = 0; i < 5; i++){
                int index2 = getRandomInteger(11, 1);


                while (computerCards.contains(index2) || userCards.contains(index2)){
                    index2 = getRandomInteger(11, 1);
                    while (index2 == 0){
                        index2 = getRandomInteger(11, 1);
                    }
                }
                if (!computerCards.contains(index2) || !(userCards.contains(index2))){


                    computerCards.add(index2);
                }


            }
        }


        public void Play()
        {


            Integer userNumber;
            Integer computerNumber;
            int userScore = 0;
            int computerScore = 0;


            ShuffleDeck();


            DisplayDeck();


            Scanner scan = new Scanner(System.in);
            while (!userCards.isEmpty())
            {
                printxy(0, 50, "");
                System.out.print("Enter card number to play: ");
                    userNumber = scan.nextInt();
                    // remove number from linked list
                    userCards.remove(userNumber);
                    // display new deck or cards
                    DisplayDeck();
                    // computer picks number
                    computerNumber = GetComputerNumber();
                    // delete number from computer deck
                    computerCards.remove(computerNumber);
                    // display new deck of carfs
                    DisplayDeck();
                    // display "remover card" in middle
                    DisplayCard(15, 15, userNumber - 1);
                    // display computer removed card
                    DisplayCard(30,15,computerNumber - 1);


                    if (userNumber > computerNumber)
                    {
                            userScore++;
                    }
                    if (userNumber < computerNumber) {
                            computerScore++;
                    }
                    printxy(0,35,"");
                    System.out.println("User: " + userScore);
                    printxy(30,35,"");
                    System.out.println("Computer: " + computerScore);


            }
            scan.close();
            if (computerScore > userScore)
            {
                cls();
                System.out.print("Computer Wins!");
                System.out.println("");
            }
            else {
                cls();
                System.out.print("You Win!");
                System.out.println("");
            }
            
            //DisplayCard(3, 3, 0);
            //DisplayCard(18, 3, 1);
            //DisplayCard(33,3,2);
            //DisplayCard(48,3,3);
            //tools.Symbols.PrintSymbols();
        }


    }