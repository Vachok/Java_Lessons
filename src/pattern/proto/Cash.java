package pattern.proto;
/**
 Класс, который будет хранить клона.

 @see ProtoMain
 @since 27.04.2018 (21:38) */
class Cash {
    /**
     Объект, для клонирования.

     @see ProtoMain
     */
    private Student student;

    /**
     Getter возвращает клон {@link Student}.

     @return {@link Student#clone()}

     @throws CloneNotSupportedException если клонирование не поддерживается
     */
    public Student getStudent() throws CloneNotSupportedException {
        return student.clone();
    }

    /**
     Помещает {@link Student} в {@link Cash}.

     @param student new {@link Student}.
     @return {@link Student}.
     */
    public Cash setStudent(Student student) {
        this.student = student;
        return this;
    }
}