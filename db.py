from pymongo import MongoClient
client=MongoClient("mongodb+srv://root:root@cluster0.yhrtq.mongodb.net/?retryWrites=true&w=majority")
db = client.get_database("sample")
records = db.users
record = {
    "module" : 2,
    "modName" : "cloud defintion"
}
rec_list = [{
    "module" : 3,
    "modName" : "grid Definition",
    "subMod" : "distributed System"
},
{
    "module" : 4,
    "modName" : "Fog",
    "subMod" : "Cluster"
} ]
records.insert_one(record)
records.insert_many(rec_list)
records.delete_one({"module" : 4})
records.delete_many({"module" : 4})
records.update_one({"module" : 3}, {"$set" : {"modName" : "parallel"}})
res = list(records.find())
for data in res:
    print(data)