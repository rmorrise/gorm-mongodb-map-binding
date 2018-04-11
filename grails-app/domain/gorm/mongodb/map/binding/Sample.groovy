package gorm.mongodb.map.binding

class Sample {
    String name
    Map value
    static embedded = ['value']

    static constraints = {
        name nullable: true
        value nullable: false, minSize: 1
    }
}
