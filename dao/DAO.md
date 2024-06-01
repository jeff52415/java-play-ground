
# Data Access Object (DAO) Pattern

## Key Points of the DAO Pattern

1. **Abstraction:**
   - The DAO pattern abstracts and encapsulates all access to the data source. The client interacts with the data source through the DAO interface, which provides a high-level API. This abstraction allows the underlying data access mechanisms to change without affecting the client code.

2. **Separation of Concerns:**
   - By separating the data access logic into its own layer (DAO layer), the pattern promotes a clean separation of concerns. The business logic is separated from the persistence logic, leading to more maintainable and testable code.

3. **Encapsulation:**
   - The data access operations are encapsulated within the DAO classes. This encapsulation hides the complexities of the data access implementation from the client, providing a simple and consistent API for data operations.

4. **Maintainability:**
   - Changes to the data access logic (e.g., switching from an in-memory list to a database) require changes only in the DAO layer. The client code remains unaffected, making the system easier to maintain and evolve.

5. **Reusability:**
   - The DAO layer can be reused across different parts of the application or even across different applications. The same data access logic can be applied to different business processes.

6. **Testing:**
   - The DAO pattern makes it easier to write unit tests for the data access logic. Mock implementations of the DAO interface can be used to test the business logic in isolation from the actual data source.
