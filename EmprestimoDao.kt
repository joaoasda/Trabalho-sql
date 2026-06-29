@Dao
interface EmprestimoDao {

    @Query("SELECT * FROM emprestimo ORDER BY data DESC")
    fun getAll(): Flow<List<Emprestimo>>

    @Insert
    suspend fun insert(emprestimo: Emprestimo)

    @Delete
    suspend fun delete(emprestimo: Emprestimo)
}
