package ru.vitalynec.java.course;

import ru.vitalynec.java.domain.Operable;

public interface Withstandable {
    void accept(Operable t);
    void printInfo();
}
