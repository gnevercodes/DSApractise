
public class hashmapImplemenation {

    private Entity[] entities;

    public hashmapImplemenation() {
        entities = new Entity[100];
    }

    private class Entity {

        String key;
        int value;

        public Entity(String key, int value) {
            this.key = key;
            this.value = value;

        }
    }

    public void put(String key, int value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);

    }

    public String get(int key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entites[hash].key.equals(key)) {
            return entities[hash].value;
        }
    }
}
