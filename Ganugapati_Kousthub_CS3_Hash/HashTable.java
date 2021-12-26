class HashTable 
{
    private Entry[] table;
    private int capacity;
    private int size;
    public HashTable()
    {
        capacity = 101;
        table = new Entry[101];
        size =0;
    }
    public HashTable(int initCap)
    {
        table = new Entry[initCap];
        capacity = initCap;
        size = 0;
    }
    public Object put(Object key, Object value)
    {
        if(size == capacity)
        {
            return null;
        }
        int hashCode = key.hashCode();
        if(hashCode < 0)
        {
            hashCode = -1 * hashCode;
        }
        Entry entry = new Entry(key, value);
        int index = hashCode % capacity;
        int searchInd = index;
        boolean storedEntry = false;
        
        while (storedEntry == false)
        {
        
            if (searchInd == capacity)
            {
                searchInd = 0;
            }
            Entry searchEntry = table[searchInd];
            if(searchEntry == null || searchEntry.isRemove() == true)
            {
                table[searchInd] = entry;
                storedEntry = true;
            }
            else if (searchEntry.getKey().equals(key))
            {
                table[searchInd] = entry;
                storedEntry = true;
                return searchEntry.getValue();
            }
            searchInd++;
            
        }
        
        
        while (searchInd < capacity)
        {
            Entry searchEntry = table[searchInd];
            if (searchEntry != null && searchEntry.isRemove() == false && searchEntry.getKey().equals(key))
            {
                searchEntry.setRemoved(true);
                return searchEntry.getValue();
            }
            searchInd++;
        }
        
        searchInd = 0;
        while (searchInd < index)
        {
            Entry searchEntry = table[searchInd];
            if (searchEntry != null && searchEntry.isRemove() == false && searchEntry.getKey().equals(key))
            {
                searchEntry.setRemoved(true);
                return searchEntry.getValue();
            }
            searchInd++;
        }
        size++;
        return null;
    
    }
    public Object get (Object key)
    {
        Entry returnVal = null;
        int hashCode = key.hashCode();    
        if(hashCode < 0)
        {
            hashCode = -1 * hashCode;
        }
        int index = hashCode % capacity;
        returnVal = table[index];
        if(returnVal != null)
        {
            if(returnVal.isRemove() == false && returnVal.getKey().equals(key))
            {
                return returnVal.getValue();
            }
        }
        for ( int i = 0; i< capacity; i++)
        {
            returnVal = table[i];
            if(returnVal != null)
            {
                if(returnVal.isRemove() == false && returnVal.getKey().equals(key))
                {
                    return returnVal.getValue();
                }
            }
        
        }
        return null;
    }
    public String toString()
    {
        String returnVal = "";
        for(int i = 0; i<capacity; i++)
        {
            String indexVal = i + "";
            if(indexVal.length() == 1)
            {
                indexVal = "00" + indexVal;
            }
            else if(indexVal.length() == 2)
            {
                indexVal = "0" + indexVal;
            }
            if(returnVal.length() != 0)
            {
                returnVal = returnVal + "\n" ;
            }
            Entry entry = table[i];
            if(entry != null)
            {
                returnVal =returnVal  + indexVal + " : "+ entry.toString();
            }
            else
            {
                returnVal = returnVal  + indexVal;
            }
        
       }
       return returnVal;
    }
    public Object remove(Object key)
    {
        Entry removeValue = null;
        int hashCode = key.hashCode();
        if(hashCode < 0)
        {
            hashCode = -1 * hashCode;
        }
        int index = hashCode % capacity;
        removeValue  = table[index];
        
        
        if(removeValue != null)
        {
            if(removeValue.isRemove() == false && removeValue.getKey().equals(key))
            {
                removeValue.setRemoved(true);
                size--;
                return removeValue.getValue();
            }
        }
        
        int i = 0;
        while(i < capacity)
        {
        
            removeValue = table[i];
            if(removeValue != null)
            {
                if(removeValue.isRemove()== false && removeValue.getKey().equals(key))
                {
                
                    removeValue.setRemoved(true);
                    size--;
                    return removeValue.getValue();
                }
            }
            i++;
        
        }
        return null;


    }
    private class Entry
    {
        private Object key;
        private Object value;
        private boolean removed;
        public Entry()
        {
            removed  = false;
        }
        public Entry(Object key, Object value)
        {
            this.key = key;
            this.value = value;
            this.removed = false;
        }
        public boolean isRemove()
        {
            return removed;
        }
        public void setRemoved(boolean removed)
        {
            this.removed = removed;
        }
        public String toString()
        {
            if(removed == true)
            {
            return "dummy";
            }
            return key+ " " + value;
        }
        public Object getKey()
        {
            return key;
        }
        public Object getValue()
        {
            return value;
         }
    }
}




