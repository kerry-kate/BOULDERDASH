package model.dao;

/** The Query Entity class
 *
 * @author Group 8
 */
public abstract class QueryEntity {

    /**
     * Gets the sql query
     * @return sql query
     */
    public static String getQueryInsert() {
        return "INSERT INTO \"map\" (\"width\", \"height\")" +
                "VALUES (40,22);";
    }

    public static String getQuerySelectAll(){
        return "SELECT * FROM \"map\";";
    }


}
