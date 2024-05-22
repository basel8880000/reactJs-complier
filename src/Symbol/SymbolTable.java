package Symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable {
    private final List<Map<String, SymbolInfo>> scopes;

    public SymbolTable() {
        this.scopes = new ArrayList<>();
        this.scopes.add(new HashMap<>());  // Global scope
    }

    public void enterScope() {
        this.scopes.add(new HashMap<>());
    }

    public void exitScope() {
        this.scopes.remove(this.scopes.size() - 1);
    }

    public void addSymbol(String name, SymbolInfo info) {
        this.scopes.get(this.scopes.size() - 1).put(name, info);
    }

    public SymbolInfo lookup(String name) {
        for (int i = this.scopes.size() - 1; i >= 0; i--) {
            if (this.scopes.get(i).containsKey(name)) {
                return this.scopes.get(i).get(name);
            }
        }
        return null;  // Symbol not found
    }
}
