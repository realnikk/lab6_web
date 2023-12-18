package org.example.hibLab.exception;

import org.hibernate.HibernateError;

public class ShowException {
    public static void showNotice(HibernateError e){
        e.printStackTrace();
    }
}
