mkdir tmp && cd $_

cs launch org.foundweekends.giter8:giter8_2.12:0.13.0-M1 -- $organization/$template.g8 --name="$template"

TEMPLATE_DIR=$(ls -td ./*/ | head -1)

mv -v $TEMPLATE_DIR/* ../
mv -v $TEMPLATE_DIR/project/* ../project

cd ../

rm -rf tmp
