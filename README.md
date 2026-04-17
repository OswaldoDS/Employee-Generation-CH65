# Employee Generation CH65
Programa que permita gestionar una DB de una empresa, donde se clasificarán roles: Manager y Developer.

## Requerimientos
1. Trabajar bajo POO.
2. Organizar proyecto en packages.
3. Crear métodos para Manager y Developer.
4. Crear, recuperar, buscar, eliminar en la DB.

**Organización de Packages**
- *model*: `Employee.java`.
  - *developer*: `Developer.java`.
  - *manager*: `Manager.java`.
- *service*: `EmployeeService.java`, `ManagerService.java`, `DeveloperService.java`.
- *exceptions*: `EmployeeNotFoundException.java`.
- *main*: `Main.java`.