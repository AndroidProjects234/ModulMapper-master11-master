package com.example.modulmapper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {

    public String[][]networking={{"1","COMP501", "Information Technology Operations", "To enable students to apply fundamental IT technical support concepts and practice, and configure and administer systems and applications to meet organisational requirements", "15"},
            {"1","COMP502", "Fundamentals of Programming and Problem Solving", "To enable students to apply the principles of software development to create simple working applications and use problem-solving and decision-making techniques to provide innovative and timely Information Technology outcomes", "15"},
            {"1","INFO501", "Professional Practice", "To enable students to apply professional, legal, and ethical principles and practices in a socially responsible manner as an emerging IT professional, and apply communication, personal and interpersonal skills to enhance effectiveness in an IT role", "15"},
            {"1","INFO502", "Business Systems Analysis and Design", "The student will be able to apply the fundamentals of information systems concepts and practice to support and enhance organisational processes and systems; and apply the fundamentals of interaction design concepts and practice to enhance interface design", "15"},
            {"1","COMP503", "Introduction to Networks", "To enable students to apply a broad operational knowledge of networking, and associated services and technologies to meet typical organisational requirements", "15"},
            {"1","COMP504", "Operating Systems and System Supports", "To enable students to select, install, and configure IT hardware and systems software and use graphical (GUI) and command line interfaces (CLI) to meet organisational requirements", "15"},
            {"1","INFO503", "Database Principles", "To enable students to apply a broad operational knowledge of database administration to meet typical organisational data storage and retrieval requirements, and apply conceptual knowledge of cloud services and virtualisation", "15"},
            {"1","INFO504", "Technical Support", "To enable students to demonstrate an operational knowledge and understanding of IT service management, identify common issues related to IT security, and troubleshoot and resolve a range of common system problems", "15"},
            {"2","COMP601", "Object Oriented Programming", "To enable students to gain the skills to develop software applications using Object Oriented Programming techniques. Students will enrich their programming and problem solving skills by applying classes, objects, constructors, methods and properties, inheritance and polymorphism to develop programming applications", "15"},
            {"2","INFO601", "Database Modelling and SQL", "To enable students to apply an indepth understanding of database modelling, database design and SQL concepts", "15"},
            {"2","MATH601", "Mathematics for Information Technology", "To enable students to gain mathematical skills and acquire in-depth understanding of mathematics as applied to Information Technology", "15"},
            {"2","COMP602", "Web Development", "To enable students to gain the in depth knowledge and skills required to be able to write programs in web programming languages that solve various web programming tasks", "15"},
            {"2","INFO602", "Business, Interpersonal Communications and Technical Writing", "To enable students to develop an understanding of the principles and processes involved in effective interpersonal communication and technical writing used in managing client relationships", "15"},
            {"2","COMP615", "Data Centre Infrastructure", "To enable students to apply a broad operational knowledge of data centres and associated technologies to meet typical organisational requirements", "15"},
            {"2","INFO603", "Systems Administration", "To enable students to gain the skills and knowledge required to effectively plan, install and administer a Microsoft Windows Server", "15"},
            {"2","COMP604", "Routing and Switching Essentials", "To enable students to configure, troubleshoot and understand the operation of Routers, Routing Protocols, Switches and VLANs in a networking environment, and complete the Cisco Certified Network Associate 2 (CCNA2) Curriculum", "15"},
            {"3","COMP701", "Advanced Networking", "To enable students to investigate and configure advanced system administration tools, advanced network virtualisation and wireless networking technologies. Students will also research emerging networking technologies", "15"},
            {"3","INFO702", "Cyber-Security", "To enable students to investigate computer system attacks and vulnerabilities in relation to operating systems (OS), applications, networking and websites, and investigate the security techniques for protecting a computer system from such attacks", "15"},
            {"3","COMP702", "Scaling Networks", "To enable students to gain an understanding of the architecture, components, and operations of routers and switches in larger and more complex networks", "15"},
            {"3","COMP704", "Network Security", "To enable students to gain core security knowledge and skills needed for installation, troubleshooting, and monitoring of networks to maintain the integrity, confidentiality, and availability of data and devices", "15"},
            {"3","BIZM701", "Business Essentials for IT Professionals", "To enable students to develop an understanding of the common principles of business practice whilst focussing on the theoretical and practical concepts of accounting, marketing and management in order to understand the business context within which Information Technology solutions are developed", "15"},
            {"3","COMP705", "Connecting Networks", "To enable students to gain an understanding of Wide Area Network (WAN) technologies and network services required by converged applications in a complex network", "15"},
            {"3","COMP714", "Network Engineering Project", "To enable students to develop a Computer networking solution from a set of requirements documents. This module is the Network Engineering Capstone Project", "30"}
    };
    public String[][]databases={{"1","COMP501", "Information Technology Operations", "To enable students to apply fundamental IT technical support concepts and practice, and configure and administer systems and applications to meet organisational requirements", "15"},
            {"1","COMP502", "Fundamentals of Programming and Problem Solving", "To enable students to apply the principles of software development to create simple working applications and use problem-solving and decision-making techniques to provide innovative and timely Information Technology outcomes", "15"},
            {"1","INFO501", "Professional Practice", "To enable students to apply professional, legal, and ethical principles and practices in a socially responsible manner as an emerging IT professional, and apply communication, personal and interpersonal skills to enhance effectiveness in an IT role", "15"},
            {"1","INFO502", "Business Systems Analysis and Design", "The student will be able to apply the fundamentals of information systems concepts and practice to support and enhance organisational processes and systems; and apply the fundamentals of interaction design concepts and practice to enhance interface design", "15"},
            {"1","COMP503", "Introduction to Networks", "To enable students to apply a broad operational knowledge of networking, and associated services and technologies to meet typical organisational requirements", "15"},
            {"1","COMP504", "Operating Systems and System Supports", "To enable students to select, install, and configure IT hardware and systems software and use graphical (GUI) and command line interfaces (CLI) to meet organisational requirements", "15"},
            {"1","INFO503", "Database Principles", "To enable students to apply a broad operational knowledge of database administration to meet typical organisational data storage and retrieval requirements, and apply conceptual knowledge of cloud services and virtualisation", "15"},
            {"1","INFO504", "Technical Support", "To enable students to demonstrate an operational knowledge and understanding of IT service management, identify common issues related to IT security, and troubleshoot and resolve a range of common system problems", "15"},
            {"2","COMP601", "Object Oriented Programming", "To enable students to gain the skills to develop software applications using Object Oriented Programming techniques. Students will enrich their programming and problem solving skills by applying classes, objects, constructors, methods and properties, inheritance and polymorphism to develop programming applications", "15"},
            {"2","INFO601", "Database Modelling and SQL", "To enable students to apply an indepth understanding of database modelling, database design and SQL concepts", "15"},
            {"2","MATH601", "Mathematics for Information Technology", "To enable students to gain mathematical skills and acquire in-depth understanding of mathematics as applied to Information Technology", "15"},
            {"2","COMP602", "Web Development", "To enable students to gain the in depth knowledge and skills required to be able to write programs in web programming languages that solve various web programming tasks", "15"},
            {"2","INFO602", "Business, Interpersonal Communications and Technical Writing", "To enable students to develop an understanding of the principles and processes involved in effective interpersonal communication and technical writing used in managing client relationships", "15"},
            {"2","COMP615", "Data Centre Infrastructure", "To enable students to apply a broad operational knowledge of data centres and associated technologies to meet typical organisational requirements", "15"},
            {"2","INFO603", "Systems Administration", "To enable students to gain the skills and knowledge required to effectively plan, install and administer a Microsoft Windows Server", "15"},
            {"2","COMP604", "Routing and Switching Essentials", "To enable students to configure, troubleshoot and understand the operation of Routers, Routing Protocols, Switches and VLANs in a networking environment, and complete the Cisco Certified Network Associate 2 (CCNA2) Curriculum", "15"},
            {"3","COMP701", "Advanced Networking", "To enable students to investigate and configure advanced system administration tools, advanced network virtualisation and wireless networking technologies. Students will also research emerging networking technologies", "15"},
            {"3","INFO702", "Cyber-Security", "To enable students to investigate computer system attacks and vulnerabilities in relation to operating systems (OS), applications, networking and websites, and investigate the security techniques for protecting a computer system from such attacks", "15"},
            {"3","COMP702", "Scaling Networks", "To enable students to gain an understanding of the architecture, components, and operations of routers and switches in larger and more complex networks", "15"},
            {"3","COMP704", "Network Security", "To enable students to gain core security knowledge and skills needed for installation, troubleshooting, and monitoring of networks to maintain the integrity, confidentiality, and availability of data and devices", "15"},
            {"3","BIZM701", "Business Essentials for IT Professionals", "To enable students to develop an understanding of the common principles of business practice whilst focussing on the theoretical and practical concepts of accounting, marketing and management in order to understand the business context within which Information Technology solutions are developed", "15"},
            {"3","COMP705", "Connecting Networks", "To enable students to gain an understanding of Wide Area Network (WAN) technologies and network services required by converged applications in a complex network", "15"},
            {"3","COMP714", "Network Engineering Project", "To enable students to develop a Computer networking solution from a set of requirements documents. This module is the Network Engineering Capstone Project", "30"}
    };
    public String[][]software={{"1","COMP501", "Information Technology Operations", "To enable students to apply fundamental IT technical support concepts and practice, and configure and administer systems and applications to meet organisational requirements", "15"},
            {"1","COMP502", "Fundamentals of Programming and Problem Solving", "To enable students to apply the principles of software development to create simple working applications and use problem-solving and decision-making techniques to provide innovative and timely Information Technology outcomes", "15"},
            {"1","INFO501", "Professional Practice", "To enable students to apply professional, legal, and ethical principles and practices in a socially responsible manner as an emerging IT professional, and apply communication, personal and interpersonal skills to enhance effectiveness in an IT role", "15"},
            {"1","INFO502", "Business Systems Analysis and Design", "The student will be able to apply the fundamentals of information systems concepts and practice to support and enhance organisational processes and systems; and apply the fundamentals of interaction design concepts and practice to enhance interface design", "15"},
            {"1","COMP503", "Introduction to Networks", "To enable students to apply a broad operational knowledge of networking, and associated services and technologies to meet typical organisational requirements", "15"},
            {"1","COMP504", "Operating Systems and System Supports", "To enable students to select, install, and configure IT hardware and systems software and use graphical (GUI) and command line interfaces (CLI) to meet organisational requirements", "15"},
            {"1","INFO503", "Database Principles", "To enable students to apply a broad operational knowledge of database administration to meet typical organisational data storage and retrieval requirements, and apply conceptual knowledge of cloud services and virtualisation", "15"},
            {"1","INFO504", "Technical Support", "To enable students to demonstrate an operational knowledge and understanding of IT service management, identify common issues related to IT security, and troubleshoot and resolve a range of common system problems", "15"},
            {"2","COMP601", "Object Oriented Programming", "To enable students to gain the skills to develop software applications using Object Oriented Programming techniques. Students will enrich their programming and problem solving skills by applying classes, objects, constructors, methods and properties, inheritance and polymorphism to develop programming applications", "15"},
            {"2","INFO601", "Database Modelling and SQL", "To enable students to apply an indepth understanding of database modelling, database design and SQL concepts", "15"},
            {"2","MATH601", "Mathematics for Information Technology", "To enable students to gain mathematical skills and acquire in-depth understanding of mathematics as applied to Information Technology", "15"},
            {"2","COMP602", "Web Development", "To enable students to gain the in depth knowledge and skills required to be able to write programs in web programming languages that solve various web programming tasks", "15"},
            {"2","INFO602", "Business, Interpersonal Communications and Technical Writing", "To enable students to develop an understanding of the principles and processes involved in effective interpersonal communication and technical writing used in managing client relationships", "15"},
            {"2","COMP603", "The Web Environment", "To enable students to examine the working environment and applications that are used in the web industry", "15"},
            {"2","COMP605", "Data Structures and Algorithms", "To enable students to apply programming and analytical skills to implement and analyze common data structures for computer programs. Students will cover a wide range of computer programming algorithms", "15"},
            {"2","MATH602", "Mathematics for Programming", "To enable students to obtain the mathematical skills to facilitate an in-depth understanding of advanced programming techniques. Students will be able to solve problems in recurrence functions, asymptotic functions, algorithmic puzzles, combinatorics and graph theory and advanced topics in probability and statistics", "15"},
            {"3","INFO701", "Project Management", "To enable students to understand and apply the theory of project management with particular emphasis on Information Technology projects", "15"},
            {"3","BIZM701", "Business Essentials for IT Professionals", "To enable students to develop an understanding of the common principles of business practice whilst focussing on the theoretical and practical concepts of accounting, marketing and management in order to understand the business context within which Information Technology solutions are developed", "15"},
            {"3","INFO703", "Big Data and Analytics", "To enable students to gain the practical knowledge and skills required to store, manage and analyse large amounts of data, using appropriate algorithms", "15"},
            {"3","COMP706", "Game Development", "To enable students to understand supporting theories and principles of game design and apply these to the art and science of game design, development and programming", "15"},
            {"3","INFO704", "Data Warehousing and Business Intelligence", "To enable students to examine the main components of data warehousing and apply it to business intelligence applications, enabling them to provide solutions which incorporate extracting data from different sources, storing data in a data warehouse and developing applications for business decision-making", "15"},
            {"3","COMP707", "Principles of Software Testing", "Students will gain comprehensive knowledge of software testing methodologies and software testing tools used in industry and apply fundamental aspects of software testing incorporating system requirements, quality assurance, testing processes, automation, testing types and testing levels. This forms the third part of the Software Engineering Capstone Project", "15"},
            {"3","COMP709", "Mobile Applications Development", "To enable students to design, develop and implement mobile applications on a given platform", "15"},
            {"3","COMP715", "Software Engineering Project", "Students will gain advanced software development skills. They will be able to provide an in depth analysis of prototyping, performance, correctness, software reusability, scalability and quality and maintenance and appropriate documentation. This module is the Software Engineering capstone project", "30"}
    };

    public String[][]web={{"1","COMP501", "Information Technology Operations", "To enable students to apply fundamental IT technical support concepts and practice, and configure and administer systems and applications to meet organisational requirements", "15"},
            {"1","COMP502", "Fundamentals of Programming and Problem Solving", "To enable students to apply the principles of software development to create simple working applications and use problem-solving and decision-making techniques to provide innovative and timely Information Technology outcomes", "15"},
            {"1","INFO501", "Professional Practice", "To enable students to apply professional, legal, and ethical principles and practices in a socially responsible manner as an emerging IT professional, and apply communication, personal and interpersonal skills to enhance effectiveness in an IT role", "15"},
            {"1","INFO502", "Business Systems Analysis and Design", "The student will be able to apply the fundamentals of information systems concepts and practice to support and enhance organisational processes and systems; and apply the fundamentals of interaction design concepts and practice to enhance interface design", "15"},
            {"1","COMP503", "Introduction to Networks", "To enable students to apply a broad operational knowledge of networking, and associated services and technologies to meet typical organisational requirements", "15"},
            {"1","COMP504", "Operating Systems and System Supports", "To enable students to select, install, and configure IT hardware and systems software and use graphical (GUI) and command line interfaces (CLI) to meet organisational requirements", "15"},
            {"1","INFO503", "Database Principles", "To enable students to apply a broad operational knowledge of database administration to meet typical organisational data storage and retrieval requirements, and apply conceptual knowledge of cloud services and virtualisation", "15"},
            {"1","INFO504", "Technical Support", "To enable students to demonstrate an operational knowledge and understanding of IT service management, identify common issues related to IT security, and troubleshoot and resolve a range of common system problems", "15"},
            {"2","COMP601", "Object Oriented Programming", "To enable students to gain the skills to develop software applications using Object Oriented Programming techniques. Students will enrich their programming and problem solving skills by applying classes, objects, constructors, methods and properties, inheritance and polymorphism to develop programming applications", "15"},
            {"2","INFO601", "Database Modelling and SQL", "To enable students to apply an indepth understanding of database modelling, database design and SQL concepts", "15"},
            {"2","MATH601", "Mathematics for Information Technology", "To enable students to gain mathematical skills and acquire in-depth understanding of mathematics as applied to Information Technology", "15"},
            {"2","COMP602", "Web Development", "To enable students to gain the in depth knowledge and skills required to be able to write programs in web programming languages that solve various web programming tasks", "15"},
            {"2","INFO602", "Business, Interpersonal Communications and Technical Writing", "To enable students to develop an understanding of the principles and processes involved in effective interpersonal communication and technical writing used in managing client relationships", "15"},
            {"2","COMP603", "The Web Environment", "To enable students to examine the working environment and applications that are used in the web industry", "15"},
            {"2","COMP606", "Web Programming", "To enable students to gain the in depth knowledge and skills required to be able to write programs in web programming languages that solve various web programming tasks", "15"},
            {"2","COMP607", "Visual Effects and Animation", "To enable students to develop the knowledge and skills required to design and develop effective graphics and animation, and to apply various visual effects for static graphics as well as create 3D models and produce 2D and 3D animation", "15"},
            {"3","INFO709", "Human Computer Interaction", "To enable students to understand the supporting theories and principles of user interface design with respect to human computer interaction. They will investigate applications in human computer interaction and apply usability best practices and processes", "15"},
            {"3","INFO702", "Cyber-Security", "To enable students to investigate computer system attacks and vulnerabilities in relation to operating systems (OS), applications, networking and websites, and investigate the security techniques for protecting a computer system from such attacks", "15"},
            {"3","COMP709", "Mobile Applications Development", "To enable students to design, develop and implement mobile applications on a given platform", "15"},
            {"3","COMP710", "Web Application Development", "To enable students to apply practical knowledge of Model View Controller (MVC) frameworks to plan, design and implement web applications. The core focus will be on architecture design and implementation of a web application that will meet a set of functional requirements and user interface requirements, and address business models", "15"},
            {"3","BIZM701", "Business Essentials for IT Professionals", "To enable students to develop an understanding of the common principles of business practice whilst focussing on the theoretical and practical concepts of accounting, marketing and management in order to understand the business context within which Information Technology solutions are developed", "15"},
            {"3","INFO708", "Data Visualisation", "To enable students to study and apply visual techniques that transform data into a format efficient for human perception, cognition, and communication, thus allowing for extraction of meaningful information and insight. Students will investigate data visualisation techniques, human visual systems and cognitive perception, and design, construct, and evaluate data visualisations", "15"},
            {"3","COMP713", "Web Application Project", "To enable students to further develop their knowledge of Web Applications by analysing, designing and implementing a web solution. This module is the Web Application Capstone Project", "30"}
    };



        public DatabaseHelper(Context context) {
        super(context, "Login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table students(student_id text primary key, password text)");
        db.execSQL("Create table client(password text)");
        db.execSQL("Create table networking(column_id integer primary key autoincrement,year integer,code text,title text,prescription text,credit integer ,unique(code,title,prescription,credit))");
        db.execSQL("Create table databases(column_id integer primary key autoincrement,year integer,code text,title text,prescription text,credit integer,unique(code,title,prescription,credit))");
        db.execSQL("Create table software(column_id integer primary key autoincrement,year integer,code text,title text,prescription text,credit integer,unique(code,title,prescription,credit))");
        db.execSQL("Create table web(column_id integer primary key autoincrement,year integer,code text,title text,prescription text,credit integer,unique(code,title,prescription,credit))");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table if exists students");
        db.execSQL("Drop table if exists networking");
        db.execSQL("Drop table if exists databases");
        db.execSQL("Drop table if exists software");
        db.execSQL("Drop table if exists web");
            }
    //inserting in database
    public boolean insert(String student_id, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("student_id", student_id);
        contentValues.put("password", password);
        long ins = db.insert("students", null, contentValues);
        if(ins == -1) return false;
        else return true;
    }
    //check if student already exixts
    public  boolean checkStudentID(String student_ID){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from students where student_id = ?", new String[]{student_ID});
        if(cursor.getCount()>0) return false;
        else return true;
    }

    //checking the email and password from the database
    public Boolean checkLoginDetails(String student_id, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from students where student_id=? and password = ?", new String[]{student_id, password});
        if(cursor.getCount()>0) return true;
        else return  false;
    }



    public Module getModule(String pathway, int column_id) {
        Module module = new Module();
        SQLiteDatabase db = this.getWritableDatabase();
        String selectQuery = "SELECT * FROM " + pathway + " WHERE COLUMN_ID = " + column_id + ";";
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                module.set_columnID(cursor.getInt(0));
                module.set_moduleCode(cursor.getString(1));
                module.set_moduleTitle(cursor.getString(2));
                module.set_prescription(cursor.getString(3));
                module.set_credits(cursor.getInt(4));
            } while (cursor.moveToNext());
        }

        return module;
    }

    public void addNetworking() {
        for (String[] entries : networking) {
            ContentValues values = new ContentValues();
            values.put("year", Integer.parseInt(entries[0]));
            values.put("code", entries[1]);
            values.put("title", entries[2]);
            values.put("prescription", entries[3]);
            values.put("credit", entries[4]);
            SQLiteDatabase db = getWritableDatabase();
            try {
                db.insertOrThrow("networking", null, values);
            } catch (SQLiteConstraintException e) {
            }
            db.close();
        }
    }

    public void addDatabase() {
        for (String[] entries : databases) {
            ContentValues values = new ContentValues();
            values.put("year", Integer.parseInt(entries[0]));
            values.put("code", entries[1]);
            values.put("title", entries[2]);
            values.put("prescription", entries[3]);
            values.put("credit", entries[4]);
            SQLiteDatabase db = getWritableDatabase();
            try {
                db.insertOrThrow("databases", null, values);
            } catch (SQLiteConstraintException e) {
            }
            db.close();
        }
    }

    public void addSoftware() {
        for (String[] entries : software) {
            ContentValues values = new ContentValues();
            values.put("year", Integer.parseInt(entries[0]));
            values.put("code", entries[1]);
            values.put("title", entries[2]);
            values.put("prescription", entries[3]);
            values.put("credit", entries[4]);
            SQLiteDatabase db = getWritableDatabase();
            try {
                db.insertOrThrow("software", null, values);
            } catch (SQLiteConstraintException e) {
            }
            db.close();
        }
    }

    public void addWeb() {
        for (String[] entries : web) {
            ContentValues values = new ContentValues();
            values.put("year", Integer.parseInt(entries[0]));
            values.put("code", entries[1]);
            values.put("title", entries[2]);
            values.put("prescription", entries[3]);
            values.put("credit", entries[4]);
            SQLiteDatabase db = getWritableDatabase();
            try {
                db.insertOrThrow("web", null, values);
            } catch (SQLiteConstraintException e) {
            }
            db.close();
        }
    }


}
