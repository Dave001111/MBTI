import java.util.Scanner;

public class Mbti {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] questions = {
            "1. A:expend energy, enjoy groups, B:conserve energy, enjoy one-on-one",
            "2. A:interpret literally, B:look for meaning and possibilities",
            "3. A:logical, thinking, questioning, B:empathetic, feeling, accommodating",
            "4. A:organized, orderly, B:flexible, adaptable",
            "5. A:more outgoing, think out loud, B:more reserved, think to yourself",
            "6. A:practical, realistic, experiential, B:imaginative, innovative, theoretical",
            "7. A:candid, straight forward, frank, B:tactful, kind, encouraging",
            "8. A:plan, schedule, B:unplanned, spontaneous",
            "9. A:seek many tasks, public activities, interaction with others, B:seek private, solitary activities with quiet to concentrate",
            "10. A:standard, usual, conventional, B:different, novel, unique",
            "11. A:firm, tend to criticize, hold the line, B:gentle, tend to appreciate, conciliate",
            "12. A:regulated, structured, B:easy-going, live and let live",
            "13. A:external, communicative, express yourself, B:internal, reticent, keep to yourself",
            "14. A:focus on here-and-now, B:look to the future, global perspective, big picture",
            "15. A:tough-minded, just, B:tender-hearted, merciful",
            "16. A:preparation, plan ahead, B:go with the flow, adapt as you go",
            "17. A:active, initiate, B:reflective, deliberate",
            "18. A:facts, things, what is, B:ideas, dreams, what could be, philosophical",
            "19. A:matter of fact, issue-oriented, B:sensitive, people-oriented, compassionate",
            "20. A:control, govern, B:latitude, freedom"
        };

        String[] answers = new String[20];
        System.out.print("What is your name?: ");
        String name = input.nextLine();

        
        for (int index = 0; index < 20; index++) {
            System.out.println(questions[index]);
            System.out.print("Select A or B: ");
            String response = input.nextLine();

            while (!response.equalsIgnoreCase("A") && !response.equalsIgnoreCase("B")) {
                   System.out.print("Invalid. Select A or B: ");
                   response = input.nextLine();
               }
            answers[index] = response;
        }

        System.out.println("\nHello " + name + " You selected");

        
        int countA = 0;
        int countB = 0;
        System.out.println("Extraverted vs Introverted");
        
        if (answers[0].equalsIgnoreCase("A")) {
            System.out.println("A: expend energy, enjoy groups");
            countA = countA + 1;
           } else {
            System.out.println("B: conserve energy, enjoy one-on-one");
            countB = countB + 1;
         }
        
        if (answers[4].equalsIgnoreCase("A")) {
            System.out.println("A: more outgoing, think out loud");
            countA = countA + 1;
          } else {
            System.out.println("B: more reserved, think to yourself");
            countB = countB + 1;
        }
        
        if (answers[8].equalsIgnoreCase("A")) {
            System.out.println("A: seek many tasks, public activities, interaction with others");
            countA = countA + 1;
           } else {
            System.out.println("B: seek private, solitary activities with quiet to concentrate");
            countB = countB + 1;
        }
        
        if (answers[12].equalsIgnoreCase("A")) {
            System.out.println("A: external, communicative, express yourself");
            countA = countA + 1;
           } else {
            System.out.println("B: internal, reticent, keep to yourself");
            countB = countB + 1;
        }
        
        if (answers[16].equalsIgnoreCase("A")) {
            System.out.println("A: active, initiate");
            countA = countA + 1;
          } else {
            System.out.println("B: reflective, deliberate");
            countB = countB + 1;
        }
        
        System.out.println("Number of A selected:" + countA);
        System.out.println("Number of B selected:" + countB);
        System.out.println();

        
        countA = 0;
        countB = 0;
        System.out.println("Sensing vs Intuitive");
        
        if (answers[1].equalsIgnoreCase("A")) {
            System.out.println("A: interpret literally");
            countA = countA + 1;
           } else {
            System.out.println("B: look for meaning and possibilities");
            countB = countB + 1;
         }
        
        if (answers[5].equalsIgnoreCase("A")) {
            System.out.println("A: practical, realistic, experiential");
            countA = countA + 1;
           } else {
            System.out.println("B: imaginative, innovative, theoretical");
            countB = countB + 1;
         }
        
        if (answers[9].equalsIgnoreCase("A")) {
            System.out.println("A: standard, usual, conventional");
            countA = countA + 1;
           } else {
            System.out.println("B: different, novel, unique");
            countB = countB + 1;
        }
        
        if (answers[13].equalsIgnoreCase("A")) {
            System.out.println("A: focus on here-and-now");
            countA = countA + 1;
           } else {
            System.out.println("B: look to the future, global perspective, big picture");
            countB = countB + 1;
         }
        
        if (answers[17].equalsIgnoreCase("A")) {
            System.out.println("A: facts, things, what is");
            countA = countA + 1;
        } else {
            System.out.println("B: ideas, dreams, what could be, philosophical");
            countB = countB + 1;
        }
        
        System.out.println("Number of A selected:" + countA);
        System.out.println("Number of B selected:" + countB);
        System.out.println();

        
        countA = 0;
        countB = 0;
        System.out.println("Thinking vs Feeling");
        
        if (answers[2].equalsIgnoreCase("A")) {
            System.out.println("A: logical, thinking, questioning");
            countA = countA + 1;
          } else {
            System.out.println("B: empathetic, feeling, accommodating");
            countB = countB + 1;
         }
        
        if (answers[6].equalsIgnoreCase("A")) {
            System.out.println("A: candid, straight forward, frank");
            countA = countA + 1;
          } else {
            System.out.println("B: tactful, kind, encouraging");
            countB = countB + 1;
          }
        
        if (answers[10].equalsIgnoreCase("A")) {
            System.out.println("A: firm, tend to criticize, hold the line");
            countA = countA + 1;
           } else {
            System.out.println("B: gentle, tend to appreciate, conciliate");
            countB = countB + 1;
        }
        
        if (answers[14].equalsIgnoreCase("A")) {
            System.out.println("A: tough-minded, just");
            countA = countA + 1;
           } else {
            System.out.println("B: tender-hearted, merciful");
            countB = countB + 1;
         }
        
        if (answers[18].equalsIgnoreCase("A")) {
            System.out.println("A: matter of fact, issue-oriented");
            countA = countA + 1;
          } else {
            System.out.println("B: sensitive, people-oriented, compassionate");
            countB = countB + 1;
          }
        
        System.out.println("Number of A selected:" + countA);
        System.out.println("Number of B selected:" + countB);
        System.out.println();

          
        countA = 0;
        countB = 0;
        System.out.println("Judging vs Perceiving");
        
        if (answers[3].equalsIgnoreCase("A")) {
            System.out.println("A: organized, orderly");
            countA = countA + 1;
        } else {
            System.out.println("B: flexible, adaptable");
            countB = countB + 1;
          }
        
        if (answers[7].equalsIgnoreCase("A")) {
            System.out.println("A: plan, schedule");
            countA = countA + 1;
           } else {
            System.out.println("B: unplanned, spontaneous");
            countB = countB + 1;
         }
        
        if (answers[11].equalsIgnoreCase("A")) {
            System.out.println("A: regulated, structured");
            countA = countA + 1;
           } else {
            System.out.println("B: easy-going, live and let live");
            countB = countB + 1;
        }
        
        if (answers[15].equalsIgnoreCase("A")) {
            System.out.println("A: preparation, plan ahead");
            countA = countA + 1;
           } else {
            System.out.println("B: go with the flow, adapt as you go");
            countB = countB + 1;
         }
        
        if (answers[19].equalsIgnoreCase("A")) {
            System.out.println("A: control, govern");
            countA = countA + 1;
          } else {
            System.out.println("B: latitude, freedom");
            countB = countB + 1;
        }
        
        System.out.println("Number of A selected:" + countA);
        System.out.println("Number of B selected:" + countB);
    }
}