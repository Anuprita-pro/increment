 try{
                    MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
                    DB database = mongoClient.getDB( "sofine" );
                    System.out.println("Connect to database successfully");
                    DBCollection coll;
                    coll=database.getCollection("rid");

                    BasicDBObject Where=new BasicDBObject();
                    BasicDBObject Set=new BasicDBObject();
                    String t="001";
                    int q,w,e;
                    w=1;
                    q= Integer.parseInt(jLabel6.getText());
                    e=w+q;
                    String s=""+e;
                    Set.put("id",t);
                    Set.put("iname",s);
                    Where.put("id",t);
                    jLabel6.setText(s);


                    coll.update(Where,Set);
                   
                    System.out.print("update success");
                            }
                    catch(Exception ex)
                            {

                               JOptionPane.showMessageDialog(null,"Exception occured :"+ex);

                            }
