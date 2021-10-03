package Semicolon_Execise;

import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Select one of the corresponding numbers to choose menu
                1 - Phone book
                2 - Messages
                3 - Chat
                4 - Call register
                5 - Tones
                6 - Settings
                7 - Call divert
                8 - Games
                9 - Calculator
                10 - Reminder
                11 - Clock              
                12 - Profiles
                13 - SIM services
                    """);
System.out.println("Enter a number: ");
int menu = input.nextInt();
switch(menu){
    case 1:
        System.out.println("Phone book");
        System.out.println("""
                1 - Search
                2 - Service Nos.
                3 - Add name
                4 - Erase
                5 - Edit
                6 - Assign tone
                7 - Send b'card
                8 - Options
                9 - Speed dials
                10 - Voice tags
                    """);
        int phoneBook = input.nextInt();
        switch(phoneBook) {
            case 1:
                System.out.println("Search");
                break;
            case 2:
                System.out.println("Service Nos.");
                break;
            case 3:
                System.out.println("Add name");
                break;
            case 4:
                System.out.println("Erase");
                break;
            case 5:
                System.out.println("Edit");
                break;
            case 6:
                System.out.println("Assign tone");
                break;
            case 7:
                System.out.println("Send b'card");
                break;
            case 8:
                System.out.println("Options");
                System.out.println("""
                        1 - Type of view
                        2 - Memory status
                        """);
                int options = input.nextInt();
                switch(options){
                    case 1:
                        System.out.println("Type of view");
                        break;
                    case 2:
                        System.out.println("Memory status");
                        break;
                    default: System.out.println("UNKNOWN APPLICATION");
                }
                break;
            case 9:
                System.out.println("Speed dials");
                break;
            case 10:
                System.out.println("Voice tags");
                break;
            default: System.out.println("UNKNOWN APPLICATION");
        }
        break;
    case 2:
        System.out.println("Messages");
        System.out.println("""
                1 - Write messages
                2 - Inbox 
                3 - Outbox
                4 - Picture messages
                5 - Templates
                6 - Smileys
                7 - Message settings
                8 - Info service
                9 - Voice mailbox number
                10 - Service command editor
                    """);
        int messages = input.nextInt();
        switch(messages) {
            case 1:
                System.out.println("Write messages");
                break;
            case 2:
                System.out.println("Inbox");
                break;
            case 3:
                System.out.println("Outbox");
                break;
            case 4:
                System.out.println("Picture messages");
                break;
            case 5:
                System.out.println("Templates");
                break;
            case 6:
                System.out.println("Smileys");
                break;
            case 7:
                System.out.println("Message settings");
                System.out.println("""
                        1 - Set 1
                        2 - Common
                        """);
                int messageSettings = input.nextInt();
                switch(messageSettings){
                    case 1:
                        System.out.println("Set 1");
                        System.out.println("""
                        1 - Message centre number
                        2 - Message sent at
                        3 - Message validity
                        """);
                        int set1 = input.nextInt();
                        switch(set1) {
                            case 1:
                                System.out.println("Message centre number");
                                break;
                            case 2:
                                System.out.println("Message sent at");
                                break;
                            case 3:
                                System.out.println("Message validity");
                                break;
                            default: System.out.println("UNKNOWN APPLICATION");
                        }
                        break;
                    case 2:
                        System.out.println("Common");
                        System.out.println("""
                        1 - Delivery reports
                        2 - Reply via some centre
                        3 - Character support
                        """);
                        int common = input.nextInt();
                        switch(common) {
                            case 1:
                                System.out.println("Delivery reports");
                                break;
                            case 2:
                                System.out.println("Reply via some centre");
                                break;
                            case 3:
                                System.out.println("Character support");
                                break;
                            default: System.out.println("UNKNOWN APPLICATION");
                        }
                        break;
                }
                break;
            case 8:
                System.out.println("Info service");
                break;
            case 9:
                System.out.println("Voice mailbox number");
                break;
            case 10:
                System.out.println("Service command editor");
                break;
            default: System.out.println("UNKNOWN APPLICATION");
        }
        break;
    case 3:
        System.out.println("Chat");
        break;
    case 4:
        System.out.println("Call register");
        System.out.println("""
                1 - Missed calls
                2 - Received calls
                3 - Dialled numbers
                4 - Erase recent call lists 
                5 - Show call duration
                6 - Show call costs
                7 - Call cost settings
                8 - Prepared credit
                    """);
        int callRegister = input.nextInt();
        switch(callRegister) {
            case 1:
                System.out.println("Missed calls");
                break;
            case 2:
                System.out.println("Received calls");
                break;
            case 3:
                System.out.println("Dialled numbers");
                break;
            case 4:
                System.out.println("Erase recent call lists");
                break;
            case 5:
                System.out.println("Show call duration");
                System.out.println("""
                1 - Last call duration
                2 - All calls' duration
                3 - Received calls' duration
                4 - Dialled calls' duration 
                5 - Clear timers
                    """);
                int showCallDuration = input.nextInt();
                switch(showCallDuration) {
                    case 1:
                        System.out.println("Last call duration");
                        break;
                    case 2:
                        System.out.println("All calls' durations");
                        break;
                    case 3:
                        System.out.println("Received calls' duration");
                        break;
                    case 4:
                        System.out.println("Dialled calls' duration");
                        break;
                    case 5:
                        System.out.println("Clear timers");
                        break;
                    default: System.out.println("UNKNOWN APPLICATION");
                }
                break;
            case 6:
                System.out.println("Show call costs");
                System.out.println("""
                1 - Last call cost
                2 - All calls' cost
                3 - Clear counters
                    """);
                int showCallCosts = input.nextInt();
                switch(showCallCosts) {
                    case 1:
                        System.out.println("Last call cost");
                        break;
                    case 2:
                        System.out.println("All calls' cost");
                        break;
                    case 3:
                        System.out.println("Clear counters");
                        break;
                    default: System.out.println("UNKNOWN APPLICATION");
                }
                break;
            case 7:
                System.out.println("Call cost settings");
                System.out.println("""
                1 - Call cost limit
                2 - Show costs in
                    """);
                int CallCostSettings = input.nextInt();
                switch(CallCostSettings) {
                    case 1:
                        System.out.println("Call cost limit");
                        break;
                    case 2:
                        System.out.println("Show costs in");
                        break;
                    default: System.out.println("UNKNOWN APPLICATION");
                        }
                break;
            case 8:
                System.out.println("Prepared credit");
                break;
            default: System.out.println("UNKNOWN APPLICATION");
        }
        break;
    case 5:
        System.out.println("Tones");
        System.out.println("""
                1 - Ringing tone
                2 - Ringing volume
                3 - Incoming call alert
                4 - Composer
                5 - Message alert tone
                6 - Keypad tones
                7 - Warning and game tones
                8 - Vibrating alert
                9 - Screen saver
                    """);
        int tones = input.nextInt();
        switch(tones) {
            case 1:
                System.out.println("Ringing tone");
                break;
            case 2:
                System.out.println("Ringing volume");
                break;
            case 3:
                System.out.println("Incoming call alert");
                break;
            case 4:
                System.out.println("Composer");
                break;
            case 5:
                System.out.println("Message alert tone");
                break;
            case 6:
                System.out.println("Keypad tones");
                break;
            case 7:
                System.out.println("Warning and game tones");
                break;
            case 8:
                System.out.println("Vibrating alert");
                break;
            case 9:
                System.out.println("Screen saver");
                break;
            default: System.out.println("UNKNOWN APPLICATION");
        }
        break;
    case 6:
        System.out.println("Settings");
        System.out.println("""
                1 - Call settings
                2 - Phone settings
                3 - Security settings
                4 - Restore factory settings
                    """);
        int settings = input.nextInt();
        switch(settings) {
            case 1:
                System.out.println("Call settings");
                    System.out.println( """
                            1 - Automatic redial       
                            2 - Speed dialling      
                            3 - Call waiting options       
                            4 - Own number sending       
                            5 - Phone line in use       
                            6 - Automatic answer       
                                """);
                    int callSettings = input.nextInt();
                    switch(callSettings) {
                        case 1:
                            System.out.println("Automatic redial");
                            break;
                        case 2:
                            System.out.println("Speed dialling ");
                            break;
                        case 3:
                            System.out.println("Call waiting options");
                            break;
                        case 4:
                            System.out.println("Own number sending");
                            break;
                        case 5:
                            System.out.println("Phone line in use");
                            break;
                        case 6:
                            System.out.println("Automatic answer");
                            break;
                        default: System.out.println("UNKNOWN APPLICATION");
            }
                break;
            case 2:
                System.out.println("Phone settings");
                                  System.out.println( """                                      
                                       1 - Language                                
                                       2 - Cell info display                                   
                                       3 - Welcome note                             
                                       4 - Network selection                               
                                       5 - Lights                                
                                       6 - Confirm SIM service actions                                
                                           """);
                               int phoneSettings = input.nextInt();
                               switch(phoneSettings) {
                                   case 1:
                                       System.out.println("Language");
                                       break;
                                   case 2:
                                       System.out.println("Cell info display");
                                       break;
                                   case 3:
                                       System.out.println("Welcome note");
                                       break;
                                   case 4:
                                       System.out.println("Network selection");
                                       break;
                                   case 5:
                                       System.out.println("Lights");
                                       break;
                                   case 6:
                                       System.out.println("Confirm SIM service actions");
                                       break;
                                   default: System.out.println("UNKNOWN APPLICATION");
                       }
                      break;
            case 3:
                System.out.println("Security settings");
                         System.out.println( """                                       
                              1 - PIN code request                                            
                              2 - Call barring service                                   
                              3 - Fixed dialling                                         
                              4 - Closed user group                                    
                              5 - Phone security                                           
                              6 - Change access codes                         
                                  """);
                      int securitySettings = input.nextInt();
                      switch(securitySettings) {
                          case 1:
                              System.out.println("PIN code request");
                              break;
                          case 2:
                              System.out.println("Call barring service");
                              break;
                          case 3:
                              System.out.println("Fixed dialling");
                              break;
                          case 4:
                              System.out.println("Closed user group");
                              break;
                          case 5:
                              System.out.println("Phone security");
                              break;
                          case 6:
                              System.out.println("Change access codes");
                              break;
                          default: System.out.println("UNKNOWN APPLICATION");
                      }
                   break;
            case 4:
                System.out.println("Restore factory settings");
                break;
            default: System.out.println("UNKNOWN APPLICATION");
        }
        break;
    case 7:
        System.out.println("Call divert");
        break;
    case 8:
        System.out.println("Games");
        break;
    case 9:
        System.out.println("Calculator");
        break;
    case 10:
        System.out.println("Reminder");
        break;
    case 11:
        System.out.println("Clock");
        System.out.println("""
                1 - Alarm clock
                2 - Clock settings
                3 - Date setting
                4 - Stopwatch
                5 - Countdown timer
                6 - Auto update of date and time
               """);
        int clock = input.nextInt();
        switch(clock) {
            case 1:
                System.out.println("Alarm clock");
                break;
            case 2:
                System.out.println("Clock settings");
                break;
            case 3:
                System.out.println("Date setting");
                break;
            case 4:
                System.out.println("Stopwatch");
                break;
            case 5:
                System.out.println("Countdown timer");
                break;
            case 6:
                System.out.println("Auto update of date and time");
                break;
            default: System.out.println("UNKNOWN APPLICATION");
        }
        break;
    case 12:
        System.out.println("Profile");
        break;
    case 13:
        System.out.println("SIM services");
        break;

}
    }
}
